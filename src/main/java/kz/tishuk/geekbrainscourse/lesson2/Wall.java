package kz.tishuk.geekbrainscourse.lesson2;

public record Wall(String name, int height) implements Obstacle{

    @Override
    public int getValue() {
        return height;
    }

    @Override
    public String getName() {
        return name;
    }
}
