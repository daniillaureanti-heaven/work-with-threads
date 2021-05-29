package task2.threads;

import java.awt.*;

public class ChangeColors implements Runnable{
    Color color;

    @Override
    public synchronized void run() {
        for (int x = 0; x < ReadImage.getSource().getWidth(); x++) {
            for (int y = 0; y < ReadImage.getSource().getHeight(); y++) {

                color = new Color(ReadImage.getSource().getRGB(x, y));

                int blue = color.getBlue();
                int red = color.getRed();
                int green = color.getGreen();

                int grey = (int) (red * 0.299 + green * 0.587 + blue * 0.114);

                int newBlue = grey;
                int newRed = grey;
                int newGreen = grey;

                Color newColor = new Color(newBlue, newRed, newGreen);

                ReadImage.getResult().setRGB(x, y, newColor.getRGB());
            }
        }


    }
}
