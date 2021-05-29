package task1;

import java.util.Arrays;

public class ThreadMinimumArrayValue implements Runnable {
    @Override
    public void run() {
        System.out.println("3 stream start");

        int minNumArray = Arrays.stream(ThreadInitializationArray.getMas())
                .reduce(Integer::min).getAsInt();

        System.out.println("Minimum value in an array = " + minNumArray);
        System.out.println("3 stream finish");
        System.out.println();

    }
}
