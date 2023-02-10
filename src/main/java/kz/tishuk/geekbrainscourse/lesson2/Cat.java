package kz.tishuk.geekbrainscourse.lesson2;

public class Cat implements CanRunJump{
    final String name;
    final int maxDistanceRun;
    final int maxHeightJump;

    public Cat(String name, int maxDistanceRun, int maxHeightJump) {
        this.name = name;
        this.maxDistanceRun = maxDistanceRun;
        this.maxHeightJump = maxHeightJump;
    }

    @Override
    public boolean run(int maxDistanceRun, Obstacle obstacle) {
        return maxDistanceRun >= obstacle.getValue();
    }

    @Override
    public boolean jump(int maxHeightJump, Obstacle obstacle) {
        return maxHeightJump >= obstacle.getValue();
    }

    @Override
    public int getMaxDistanceRun() {
        return maxDistanceRun;
    }

    @Override
    public int getMaxHeightJump() {
        return maxHeightJump;
    }

    @Override
    public String name() {
        return name;
    }

}
