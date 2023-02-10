package kz.tishuk.geekbrainscourse.lesson1.Animal;

public abstract class Animal {
    String type;
    String name;
    int maxDistanceRun;
    int maxDistanceSwim;
    public static int count;

    public Animal(String type, String name, int maxDistanceRun, int maxDistanceSwim) {
        count++;
        this.type = type;
        this.name = name;
        this.maxDistanceRun = maxDistanceRun;
        this.maxDistanceSwim = maxDistanceSwim;
    }


    public void run (int distance) {
        if(maxDistanceRun == 0) {
            System.out.println(type + " " + name + " не умеет бегать");
        } else if(distance > 0 && distance <= maxDistanceRun) {
            System.out.println(type + " " + name + " смог пробежать всю дистанцию");
        } else if(distance > maxDistanceRun) {
            System.out.println(type + " " + name + " смог пробежать всего лишь " + maxDistanceRun);
        } else {
            System.out.println(type + " " + name + " не побежал, дистанция имеет отрицательное значение");
        }
    }
    public void swim (int distance) {
        if(maxDistanceSwim == 0) {
            System.out.println(type + " " + name + " не умеет плавать");
        } else if(distance > 0 && distance <= maxDistanceSwim) {
            System.out.println(type + " " + name + " смог проплыть всю дистанцию");
        } else if(distance >= maxDistanceSwim) {
            System.out.println(type + " " + name + " смог проплыть всего лишь " + maxDistanceSwim);
        } else {
            System.out.println(type + " " + name + " не поплыл, дистанция имеет отрицательное значение");
        }
    }
}
