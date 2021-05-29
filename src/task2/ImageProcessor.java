package task2;

public class ImageProcessor {
    /*
    Задание *
    На жестком диске в файле размещено изображение(формат BMP).
    Нужно прочитать его, спросить у юзера о пороге фильрации.
    Например, юзер ввел 201, значит все цветовые насыщенности,
    превышающие 201 превращаются в 201(остальные без изменений).
    */
    public static void main(String[] args) {

        Converter converter = new Converter();
        converter.go();
    }
}