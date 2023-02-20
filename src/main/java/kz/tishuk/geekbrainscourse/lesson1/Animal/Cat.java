package kz.tishuk.geekbrainscourse.lesson1.Animal;

public class Cat extends Animal{

    static final int maxDistanceRun = 200;
    static final int maxDistanceSwim = 0;
    public static int count;

    public Cat(String name) {
        super("Кот", name, Cat.maxDistanceRun, Cat.maxDistanceSwim);
        count++;
    }
}
