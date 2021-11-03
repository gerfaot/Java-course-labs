package ru.funnycompany.lesson3;

public class Dog extends Animal {
    protected Dog(String name) {
        this.name = name;
        counter++;
    }

    private int runDist = 500;
    private int swimDist = 10;

    @Override
    protected void run(int dist){
        System.out.println(runDist > dist && dist > 0 ?
                name + " пробежал " + dist + " метров" :
                runDist < dist ?
                name + " не может столько пробежать" :
                name + " - крутой пёс, он бежит только вперёд!");
    }

    @Override
    protected void swim(int dist){
        System.out.println(swimDist > dist && dist > 0 ?
                name + " проплыл " + dist + " метров" :
                runDist < dist ?
                name + " не может столько проплыть" :
                name + " - крутой пёс, он плывёт только вперёд!");
    }

}
