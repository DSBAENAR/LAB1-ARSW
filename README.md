# LAB1-ARSW

## Parte I - Introducción a Hilos en Java

1. De acuerdo con lo revisado en las lecturas, complete las clases CountThread, para que las mismas definan el ciclo de vida de un hilo que imprima por pantalla los números entre A y B.

```
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hcadavid
 */
public class CountThread extends Thread {
    private int initial;
    private int end;

    public CountThread(int initial, int end) {
        this.initial = initial;
        this.end = end;
    }

    @Override
    public void run() {
        increment();
    }

    public void increment() {
        for (int i = initial; i <= end; i++) {
            System.out.println("Counting: " + i);
        }
    }
    

    
}
```


