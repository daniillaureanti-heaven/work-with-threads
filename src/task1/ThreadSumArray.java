package task1;

import java.util.Arrays;

public class ThreadSumArray implements Runnable {

    @Override
    public void run() {
        System.out.println("2 stream start");

        int sumArray = (int) Arrays.stream(ThreadInitializationArray.getMas())
                .mapToDouble(v -> Integer.parseInt(String.valueOf(v)))
                .sum();

        System.out.println("Sum Array Elements = " + sumArray);

        System.out.println("2 stream finish");
        System.out.println();
    }
}
