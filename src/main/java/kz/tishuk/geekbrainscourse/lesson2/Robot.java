package kz.tishuk.geekbrainscourse.lesson2;

public class Robot implements CanRunJump{
    final String name;
    final int maxDistanceRun;
    final int maxHeightJump;

    public String getName() {
        return name;
    }

    @Override
    public boolean run(int maxDistanceRun, Obstacle obstacle) {
        return maxDistanceRun >= obstacle.getValue();
    }

    @Override
    public boolean jump(int maxHeightJump, Obstacle obstacle) {
        return maxHeightJump >= obstacle.getValue();
    }

    public int getMaxDistanceRun() {
        return maxDistanceRun;
    }

    public int getMaxHeightJump() {
        return maxHeightJump;
    }

    @Override
    public String name() {
        return name;
    }

    public Robot(String name, int maxDistanceRun, int maxHeightJump) {
        this.name = name;
        this.maxDistanceRun = maxDistanceRun;
        this.maxHeightJump = maxHeightJump;
    }


}
