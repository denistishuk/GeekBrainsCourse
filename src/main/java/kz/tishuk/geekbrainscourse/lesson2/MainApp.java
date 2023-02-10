package kz.tishuk.geekbrainscourse.lesson2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MainApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", 100, 3);
        Robot robot = new Robot("Робот", 50, 1);
        Human human = new Human("Человек", 1000, 2);

        Road road = new Road("Дорога", 10);
        Wall wall = new Wall("Стена", 20);

        List<CanRunJump> listParticipants = new ArrayList<>();
            listParticipants.add(cat);
            listParticipants.add(robot);
            listParticipants.add(human);

        List<Obstacle> listObstacle = new ArrayList<>();
            listObstacle.add(road);
            listObstacle.add(wall);


        for (CanRunJump listParticipant : listParticipants) {
            for (Obstacle obstacle : listObstacle) {
                String nameObstacle = obstacle.getName();
                String nameParticipant = listParticipant.name();
                System.out.println("Препятствие " + nameObstacle + " , стартует " + nameParticipant);

                if(obstacle instanceof Road){
                    if (listParticipant.run(listParticipant.getMaxDistanceRun(), obstacle)) {
                        System.out.println(nameParticipant + " прошел испытание");
                    } else {
                        System.out.println(nameParticipant + " не справился");
                        System.out.println("Следующий участник");
                        break;
                    }
                } else if(obstacle instanceof Wall) {
                    if (listParticipant.jump(listParticipant.getMaxHeightJump(), obstacle)) {
                        System.out.println(nameParticipant + " прошел испытание");
                    } else {
                        System.out.println(nameParticipant + " не справился");
                        System.out.println("Следующий участник");
                        break;
                    }
                }
            }
        }
    }
}
