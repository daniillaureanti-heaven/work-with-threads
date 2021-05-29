package task1;

public class Main {
    /*
	Задание 1
    При старте приложения запускаются три потока. Первый поток заполняет массив случайными числами. Два
    других потока ожидают заполнения. Когда массив заполнен оба потока запускаются. Первый поток находит сумму
    элементов массива, второй поток минимальное
    значение в массиве(CRC). Полученный массив, сумма и среднеарифметическое возвращаются в метод main, где должны
    быть отображены.
	*/
    public static void main(String[] args) {

        System.out.println("task1.Main stream start");

        ThreadInitializationArray initializationArray = new ThreadInitializationArray();
        ThreadSumArray threadSumArray = new ThreadSumArray();
        ThreadMinimumArrayValue threadMinimumArrayValue = new ThreadMinimumArrayValue();

        Thread thread1 = new Thread(initializationArray);
        Thread thread2 = new Thread(threadSumArray);
        Thread thread3 = new Thread(threadMinimumArrayValue);

        thread1.start();

        if (thread1.isAlive()) {
            try {
                thread1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        thread2.start();

        if (thread2.isAlive()) {
            try {
                thread2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        thread3.start();

        if (thread3.isAlive()) {
            try {
                thread3.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("task1.Main stream finish");
    }
}
