package BlackList;


import java.util.List;


public class Main {
    
    public static void main(String[] args) throws Exception {
    HostBlackListsValidator validator = new HostBlackListsValidator();

    int cores = Runtime.getRuntime().availableProcessors();
    int[] threadConfigs = {1, cores, cores * 2, 50, 100};

    for (int N : threadConfigs) {
        long start = System.currentTimeMillis();
        List<Integer> result = validator.checkHost("202.24.34.55", N);
        long end = System.currentTimeMillis();

        System.out.println("Hilos: " + N +
                " | Tiempo: " + (end - start) + " ms" +
                " | Ocurrencias: " + result.size());
    }

    // 🔴 Espera 60 segundos antes de terminar (ajústalo según necesites)
    System.out.println("Programa finalizado. Esperando para VisualVM...");
    Thread.sleep(60000);
}

    
}
