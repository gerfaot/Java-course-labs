package ru.funnycompany.lesson4;

public class Cat {
    private final String name;
    private boolean isHungry;
    private final int appetite;

    public Cat(String name) {
        this.name = name;
        this.appetite = 10;
        this.isHungry = true;
    }

    public int getAppetite(){
        return appetite;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void jump() {
        if(isHungry) {
            System.out.println("Kotik goloden");
            return;
        }
        System.out.println("Kotik prignul");
        isHungry = true;
    }

    public void eat(Plate plate){
        if(!isHungry) {
            System.out.println("Kotik ne hochet est'");
            return;
        }
        if(plate.food > appetite) {
            plate.decreaseFood(appetite);
            isHungry = false;
            System.out.println("Kotik poel");
            return;
        }
        System.out.println("Not enough food, kotik ostalsya golodnim");
    }

    @Override
    public String toString() {
        return "Cat " + name + " with appetite of " + appetite + (isHungry ? " and he is very hungry" : " and he is full");
    }
}
