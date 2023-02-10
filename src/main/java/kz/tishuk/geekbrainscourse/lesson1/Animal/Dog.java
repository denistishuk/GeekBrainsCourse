package kz.tishuk.geekbrainscourse.lesson1.Animal;

public class Dog extends Animal{
    static final int maxDistanceRun = 500;
    static final int maxDistanceSwim = 10;
    public static int count;

    public Dog(String name) {
        super("Собака", name, Dog.maxDistanceRun, Dog.maxDistanceSwim);
        count++;
    }
}
