package ru.funnycompany.lesson5;

public class MainApp {
    public static void main(String[] args) {
        Member[] members = new Member[5];

        members[0] = new Robot("Max", 10);
        members[1] = new Human("Anatole", 8);
        members[2] = new Human("Janna", 6);
        members[3] = new Cat("Topik", 3);
        members[4] = new Cat("Goha", 2);

        Obstruction[] obstacles = new Obstruction[3];

        obstacles[0] = new Wall(5);
        obstacles[1] = new Treadmill(2, 25);
        obstacles[2] = new Wall(6);

        for (Member member : members) {
            for (Obstruction obstacle : obstacles) {
                if (obstacle instanceof Wall) {
                    System.out.println("wall");
                    if (!(member.jump((Wall) obstacle))) {
                        break;
                    }

                } else {
                    System.out.println("road");
                    if (!(member.run((Treadmill) obstacle))) {
                        break;
                    }
                }
            }
        }
//        int i = 0;
//        while (i < obstacles.length) {
//            for (Member member : members) {
//
//                if (obstacles[i] instanceof Wall) {
//                    System.out.println("wall");
//                    member.jump((Wall) obstacles[i]);
//                } else {
//                    System.out.println("road");
//                    member.run((Treadmill) obstacles[i]);
//                }
//
//            }
//            i++;
//            System.out.println("--------------------------");
//        }

//        if (members[3].run((Treadmill) obstacles[1])){
//
//        }
        //members[3].run((Treadmill) obstacles[1]);
    }
}
