package BlackList;


import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hcadavid
 */
public class HostBlackListsValidator {

    private static final int BLACK_LIST_ALARM_COUNT=5;
    
    /**
     * Check the given host's IP address in all the available black lists,
     * and report it as NOT Trustworthy when such IP was reported in at least
     * BLACK_LIST_ALARM_COUNT lists, or as Trustworthy in any other case.
     * The search is not exhaustive: When the number of occurrences is equal to
     * BLACK_LIST_ALARM_COUNT, the search is finished, the host reported as
     * NOT Trustworthy, and the list of the five blacklists returned.
     * @param ipaddress suspicious host's IP address.
     * @return  Blacklists numbers where the given host's IP address was found.
     */
    public List<Integer> checkHost(String ipaddress, int N) {

        LinkedList<Integer> blackListOccurrences = new LinkedList<>();
        HostBlacklistsDataSourceFacade skds = HostBlacklistsDataSourceFacade.getInstance();

        int totalServers = skds.getRegisteredServersCount();
        int chunkSize = totalServers / N;
        int remainder = totalServers % N; // para manejar si no es divisible exacto

        BlackListThread[] threads = new BlackListThread[N];
        int start = 0;

        // Crear hilos dividiendo el trabajo
        for (int i = 0; i < N; i++) {
            int end = start + chunkSize;
            if (i < remainder) { // distribuir el sobrante
                end++;
            }
            threads[i] = new BlackListThread(start, end, ipaddress);
            threads[i].start();
            start = end;
        }

        // Esperar a que terminen
        for (int i = 0; i < N; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        int occurrencesCount = 0;
        int checkedListsCount = 0;

        for (BlackListThread t : threads) {
            blackListOccurrences.addAll(t.getOccurrences());
            occurrencesCount += t.getOccurrences().size();
            checkedListsCount += t.getCounter();
        }

        // Reportar host como confiable o no
        if (occurrencesCount >= BLACK_LIST_ALARM_COUNT) {
            skds.reportAsNotTrustworthy(ipaddress);
        } else {
            skds.reportAsTrustworthy(ipaddress);
        }

        LOG.log(Level.INFO, "Checked Black Lists:{0} of {1}",
                new Object[]{checkedListsCount, skds.getRegisteredServersCount()});

        return blackListOccurrences;
    }

    
    
    private static final Logger LOG = Logger.getLogger(HostBlackListsValidator.class.getName());
    
    
    
}
