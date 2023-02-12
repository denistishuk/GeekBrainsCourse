package kz.tishuk.geekbrainscourse.lesson3;

public class MyArraySizeException extends MyException{

    public MyArraySizeException() {
        super("Массив должен быть размером [4][4]");
    }
}
