package task1;

import java.util.Arrays;

public class ThreadInitializationArray implements Runnable {

    static int[] mas = new int[10];

    @Override
    public void run() {
        System.out.println("1 stream start");

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 101);
        }
        System.out.println(Arrays.toString(mas));

        System.out.println("1 stream finish");
        System.out.println();
    }

    public static int[] getMas() {
        return mas;
    }
}