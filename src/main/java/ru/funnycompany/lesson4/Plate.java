package ru.funnycompany.lesson4;

public class Plate {
    public int food;

    public Plate(int food) {
        if (food >= 0) {
        this.food = food;
        return;
        }
        System.out.println("empty");
    }

    public void decreaseFood(int amount){
        if (food > amount && amount >= 0) {
        food -= amount;
        return;
        }
        System.out.println("Not enough food or amount is negative");
    }

    public void increaseFood(int amount){
        if (amount > 0) {
            food += amount;
        }
    }

    @Override
    public String toString() {
        return "Plate -> The amount of food is: " + food;
    }

}
