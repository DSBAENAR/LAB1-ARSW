package BlackList;

import java.util.LinkedList;
import java.util.List;

/* This class represents a thread that checks a range of blacklists for a given IP address.
 * It collects the occurrences of the IP address in the specified range and counts how many
 * times it was checked.
 */
public class BlackListThread extends Thread {
    private int start;
    private int end;
    private String ipAddress;
    private List<Integer> occurrences;
    private int counter;


    public BlackListThread(int start, int end, String ipAddress) {
        this.start = start;
        this.end = end;
        this.ipAddress = ipAddress;
        this.occurrences = new LinkedList<>();
        this.counter = 0;
    }

    @Override
    public void run(){
        HostBlacklistsDataSourceFacade skds = HostBlacklistsDataSourceFacade.getInstance();
        for (int i = start; i < end; i++){
            counter++;
            if (skds.isInBlackListServer(i, ipAddress)){
                System.out.println("Thread " + Thread.currentThread().getName() + " found IP " + ipAddress + " in blacklist " + i);
                occurrences.add(i);
            }
        }
    }


    public List<Integer> getOccurrences() {
        return occurrences;
    }


    public int getCounter() {
        return counter;
    }

    
    

    

    
}
