package kz.tishuk.geekbrainscourse.lesson1.Animal;

public class Tiger extends Animal{
    public static int count;

    public Tiger( String name, int maxDistanceRun, int maxDistanceSwim) {
        super("Тигр", name, maxDistanceRun, maxDistanceSwim);
        count++;
    }
}
