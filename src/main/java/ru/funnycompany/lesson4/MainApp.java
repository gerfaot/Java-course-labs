package ru.funnycompany.lesson4;

public class MainApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Bublik");
        Plate plate = new Plate(50);
        System.out.println(cat);
        System.out.println(plate);

        Plate plate2 = new Plate(-8);
        System.out.println(plate2);

        plate.decreaseFood(-15);
        System.out.println(plate);

        plate.decreaseFood(25);
        System.out.println(plate);

        plate.decreaseFood(55);
        System.out.println(plate);

        cat.eat(plate);
        System.out.println(plate);


        Cat[] cats = new Cat[5];

        Plate plate3 = new Plate(49);

        cats[0] = new Cat("Busya");
        cats[1] = new Cat("Dusya");
        cats[2] = new Cat("Tusya");
        cats[3] = new Cat("Susya");
        cats[4] = new Cat("Pusya");

        for (int i = 0; i < cats.length; i++ ) {
        cats[i].eat(plate3);
        System.out.println(cats[i].isHungry());
        }

        plate3.increaseFood(100);
        cats[4].eat(plate3);
    }
}
