package task2.threads;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class WriteImage implements Runnable{
    File output;

    @Override
    public void run() {
        output = new File(".src/task2/images/penguin1.bmp");
        try {
            ImageIO.write(ReadImage.getResult(), "bmp", output);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
