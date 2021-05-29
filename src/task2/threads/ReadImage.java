package task2.threads;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ReadImage implements Runnable{
    private static BufferedImage source;
    private static BufferedImage result;

    @Override
    public void run() {
        File file = new File(".src/task2/images/penguin.bmp");

        try {
            source = ImageIO.read(file);

            result = new BufferedImage(
                    source.getWidth(),
                    source.getHeight(),
                    source.getType());

        } catch (IOException e) {
            e.getMessage();
        }
    }

    public static BufferedImage getSource() {
        return source;
    }

    public static BufferedImage getResult() {
        return result;
    }
}
