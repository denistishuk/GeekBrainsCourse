package kz.tishuk.geekbrainscourse.lesson2;

public interface CanRunJump {
    boolean run(int maxDistanceRun, Obstacle obstacle);
    boolean jump (int maxHeightJump, Obstacle obstacle);

    int getMaxDistanceRun ();
    int getMaxHeightJump ();

    String name();
}
