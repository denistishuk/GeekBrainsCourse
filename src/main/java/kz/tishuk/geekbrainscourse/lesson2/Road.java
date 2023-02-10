package kz.tishuk.geekbrainscourse.lesson2;

public record Road(String name, int distance) implements Obstacle{

    @Override
    public int getValue() {
        return distance;
    }

    @Override
    public String getName() {
        return name;
    }
}
/*class Road {
    final String name;
    final int distance;

    public Road(String name, int distance) {
        this.distance = distance;
        this.name = name;
    }

}*/
