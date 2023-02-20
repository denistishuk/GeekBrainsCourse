package kz.tishuk.geekbrainscourse.lesson4.fruit;

public class Apple extends Fruit{
    static float weight = 1.0f;
    static String name = "Apple";
    public static int count = 1;
    public Apple() {
        super(Apple.name + count, Apple.weight);
        count++;
    }

}
