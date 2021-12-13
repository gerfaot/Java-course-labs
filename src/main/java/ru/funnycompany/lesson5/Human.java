package ru.funnycompany.lesson5;

public class Human implements Member {
    private String name;
    private int power;
    private int stamina;
    private final int jumpCost = 5;
    private final int runCost = 3;

    public Human(String name, int power) {
        this.name = name;
        this.power = power;
        this.stamina = (power + 5) * 50;

    }

    @Override
    public boolean run(Treadmill road) {
        if (road.speed < power && stamina > (road.speed * road.speed)) {
            stamina = stamina - (road.speed * road.speed);
            System.out.println("Человек " + name + " пробежал");
            return true;
        }
        System.out.println("Человек " + name + " не смог пробежать и выбыл из соревнований");
        return false;
    }

    @Override
    public boolean jump(Wall wall) {
        if (wall.height < power && stamina > (wall.height * 2)) {
            stamina = stamina - (wall.height * 2);
            System.out.println("Человек " + name + " перепрыгнул");
            return true;
        }
        System.out.println("Человек " + name + " не смог перепрыгнуть и выбыл из соревнований");
        return false;
    }
}
