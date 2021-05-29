package task2;

import task2.threads.ChangeColors;
import task2.threads.ReadImage;
import task2.threads.WriteImage;

public class Converter {

    ChangeColors changeColors = new ChangeColors();
    ReadImage readImage = new ReadImage();

    Thread thread1 = new Thread(readImage);

    Thread thread2 = new Thread(changeColors);

    Thread thread3 = new Thread(changeColors);

    public void go(){
        readImage();
        changeImageColors();
        saveImage();
    }

    public void readImage(){
        new ReadImage().run();
    }


    public void askUserFilteringColors(){
        System.out.println("hello word");
    }

    public void changeImageColors(){
        new ChangeColors().run();
    }

    public void saveImage(){
        new WriteImage().run();
    }
}