package ru.honework.oop;

public class Employees {
    protected String name;
    protected String position;
    protected String email;
    protected String phone;
    protected long salery;
    protected int age;

    protected Employees(String name, String position, String email,
                    String phone, long salery, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salery = salery;
        this.age = age;
    }

    public void info(){
        System.out.println("Name:" + name);
        System.out.println("Position:" + position);
        System.out.println("E-mail:" + email);
        System.out.println("Phone:" + phone);
        System.out.println("Salery:" + salery);
        System.out.println("Age:" + age);
    }

}
