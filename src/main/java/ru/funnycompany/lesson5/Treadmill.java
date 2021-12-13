package ru.funnycompany.lesson5;

public class Treadmill implements Obstruction {
    int speed;
    int distance;

    public Treadmill(int speed, int distance) {
        this.speed = speed;
        this.distance = distance;
    }


    @Override
    public boolean obstruction(Obstruction obstr) {
        if (obstr instanceof Wall) {
            System.out.println("wall");
            return true;
        } else {
            System.out.println("road");
            return false;
        }
    }
}
