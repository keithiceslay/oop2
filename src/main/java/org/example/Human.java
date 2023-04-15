package org.example;

public class Human implements Creature {
    Integer jumpLimit;
    Integer runLimit;

    public Human(Integer jumpLimit, Integer runLimit) {
        this.jumpLimit = jumpLimit;
        this.runLimit = runLimit;
    }

    @Override
    public boolean action(Creature creature, Obstacle obstacle) {
        if (obstacle instanceof Wall)
            return jump(creature, obstacle);
        else if (obstacle instanceof Treadmil)
            return run(creature, obstacle);
        return false;
    }

    @Override
    public boolean jump(Creature creature, Obstacle obstacle) {
        if (((Wall)(obstacle)).hight <= ((Human)(creature)).jumpLimit) {
            System.out.println("Человек перепрыгнул стену!");
            return true;
        }
        else if (((Wall)(obstacle)).hight > ((Human)(creature)).jumpLimit) {
            System.out.println("Человек не смог перепрыгнуть стену :(");
            return false;
        }
        return false;
    }

    @Override
    public boolean run(Creature creature, Obstacle obstacle) {
        if (((Treadmil)(obstacle)).length <= ((Human)(creature)).runLimit) {
            System.out.println("Человек пробежал дистанцию!!");
            return true;
        }
        else if (((Treadmil)(obstacle)).length > ((Human)(creature)).runLimit) {
            System.out.println("Человек не смог пробежать :(");
            return false;
        }
        return false;
    }
}
