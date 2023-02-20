package kz.tishuk.geekbrainscourse.lesson4.fruit;

public abstract class Fruit {
    String name;
    float weight;

    public Fruit(String name, float weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}' + '\n';
    }
}
