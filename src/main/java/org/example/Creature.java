package org.example;

import javax.print.attribute.standard.JobState;

public interface Creature {
     boolean action(Creature creature, Obstacle obstacle);

     boolean jump(Creature creature, Obstacle obstacle);

     boolean run(Creature creature, Obstacle obstacle);
}
