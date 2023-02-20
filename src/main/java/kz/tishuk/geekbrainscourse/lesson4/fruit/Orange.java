package kz.tishuk.geekbrainscourse.lesson4.fruit;

public class Orange extends Fruit{
    static float weight = 1.5f;
    static String name = "Orange";
    public static int count = 1;
    public Orange() {
        super(Orange.name + count, Orange.weight);
        count++;
    }
}
