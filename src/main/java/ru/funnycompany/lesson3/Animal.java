package ru.funnycompany.lesson3;

public abstract class Animal {
    protected String name;
    protected static int counter = 0;

    protected abstract void run(int dist);
    protected abstract void swim(int dist);
    protected void count(){
        System.out.println("Всего зверушек в зоопарке: " + counter);
    }

}
