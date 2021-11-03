package ru.funnycompany.lesson3;

public class HomeWork3 {
    public static void main(String[] args) {

        Dog dog = new Dog("Бобик");
        Cat cat = new Cat("Мурзик");
        Dog dog2 = new Dog("Стив");
        Cat cat2 = new Cat("Шлёпа");
        dog2.swim(15);
        dog2.swim(5);
        dog.run(359);
        dog.run(780);
        dog.run(-280);
        cat.run(88);
        cat2.run(235);
        cat2.swim(1);
        cat.count(); // Тут Вопросики конечно

    }
}
