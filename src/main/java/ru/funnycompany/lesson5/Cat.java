package ru.funnycompany.lesson5;

public class Cat implements Member {
    private String name;
    private int power;
    private int stamina;
    private final int jumpCost = 1;
    private final int runCost = 1;

    public Cat(String name, int power) {
        this.name = name;
        this.power = power;
        this.stamina = (power + 25) * 35;

    }

    public boolean canRun(Treadmill road) {
        if (road.speed < power && stamina > (road.speed * road.speed)) {

            return true;
        }

        return false;
    }

    @Override
    public boolean run(Treadmill road) {
        if (this.canRun(road)) {
            stamina = stamina - (road.speed * road.speed);
            System.out.println("Котик " + name + " пробежал");
            return true;
        }
        System.out.println("Котик " + name + " не смог пробежать и выбыл из соревнований");
        return false;
    }

    @Override
    public boolean jump(Wall wall) {
        if (wall.height < power && stamina > (wall.height * 2)) {
            stamina = stamina - (wall.height * 2);
            System.out.println("Котик " + name + " перепрыгнул");
            return true;
        }
        System.out.println("Котик " + name + " не смог перепрыгнуть и выбыл из соревнований");
        return false;
    }
}
