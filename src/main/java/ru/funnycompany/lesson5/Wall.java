package ru.funnycompany.lesson5;

public class Wall implements Obstruction {
    int height;

    public Wall(int height) {
        this.height = height;
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
