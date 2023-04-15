package org.example;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Human creature1 = new Human(10, 200);
        Cat creature2 = new Cat(20, 500);
        Robot creature3 = new Robot(15, 1000);
        Set<Creature> creatures = new HashSet<>(){{
            add(creature1);
            add(creature2);
            add(creature3);
        }};
        Wall obstacle1 = new Wall(5);
        Treadmil obstacle2 = new Treadmil(100);
        Wall obstacle3 = new Wall(12);
        Treadmil obstacle4 = new Treadmil(500);
        Wall obstacle5 = new Wall(15);
        Treadmil obstacle6 = new Treadmil(800);
        Obstacle[] obstacles = new Obstacle[6];
        obstacles[0] = obstacle1;
        obstacles[1] = obstacle2;
        obstacles[2] = obstacle3;
        obstacles[3] = obstacle4;
        obstacles[4] = obstacle5;
        obstacles[5] = obstacle6;

        for (Creature creature: creatures) {
            for (int i = 0; i < obstacles.length; i++) {
                boolean b = creature.action(creature, obstacles[i]);
                if (b == false){
                    System.out.println("Участник упал!\n");
                    break;
                }
                if (b == true && i == obstacles.length - 1) {
                    System.out.println("Участник прошел испытание!\n");
                }
            }
        }
    }
}