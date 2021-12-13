package ru.funnycompany.lesson5;

public class Robot implements Member {
    private String name;
    private int power;
    private int stamina;
    private final int jumpCost = 10;
    private final int runCost = 1;

    public Robot(String name, int power) {
        this.name = name;
        this.power = power;
        this.stamina = (power + 15) * 20;

    }

    @Override
    public boolean run(Treadmill road) {
        if (road.speed < power && stamina > (road.speed * road.speed)) {
            stamina = stamina - (road.speed * road.speed);
            System.out.println("Робот " + name + " пробежал");
            return true;
        }
        System.out.println("Робот " + name + " не смог пробежал пробежать и выбыл из соревнований");
        return false;
    }

    @Override
    public boolean jump(Wall wall) {
        if (wall.height < power && stamina > (wall.height * 2)) {
            stamina = stamina - (wall.height * 2);
            System.out.println("Робот " + name + " перепрыгнул");
            return true;
        }
        System.out.println("Робот " + name + " не смог перепрыгнуть и выбыл из соревнований");
        return false;
    }
}
