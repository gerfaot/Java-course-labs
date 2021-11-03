package ru.funnycompany.lesson3;

public class Cat extends Animal {
    protected Cat(String name) {
        this.name = name;
        counter++;
    }

    protected int runDist = 200;

    @Override
    protected void run(int dist){
        System.out.println(runDist > dist && dist > 0 ?
                name + " пробежал " + dist + " метров" :
                runDist < dist ?
                name + " не может столько пробежать" :
                name + " - крутой котик, он бежит только вперёд!");
    }
    @Override
    protected void swim(int dist){
        System.out.println(name + " не умеет плавать =(");
    }
}
