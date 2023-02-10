package kz.tishuk.geekbrainscourse.lesson1.Animal;

public class Cat extends Animal{

    static final int maxDistanceRun = 200;
    static final int maxDistanceSwim = 0;
    public static int count;

    public Cat(String name) {
        super("Кот", name, Cat.maxDistanceRun, Cat.maxDistanceSwim);
        count++;
    }

/*    @Override
    public void run(int distance) {
        if(distance > 0 && distance < distanceRun) {
            super.run(distance);
        } else if(distance >= distanceRun) {
            super.run(distanceRun);
        } else {
            System.out.println(this.getName() + " не побежал");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(this.getName() + " не умеет плавать");
    }*/
}
