package ru.honework.oop;

public class Emploees {
    public String name;
    public String position;
    public String email;
    public String phone;
    public long salery;
    public int age;

    public Emploees(String name, String position, String email,
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
