package ru.funnycompany.lesson2;

public class HomeWork2 {
    public static void main(String[] args) {

        Employees[] emplArray = new Employees[5];
        emplArray[0] = new Employees("Fedor", "driver", "fedor.i@mail.com", "+79216548798", 50000, 29);
        emplArray[1] = new Employees("Marina", "designer", "marina@mail.com", "+79216411228", 122000, 37);
        emplArray[2] = new Employees("Alisa", "scientist", "alisa@mail.com", "+79215552233", 460000, 45);
        emplArray[3] = new Employees("Oleg", "chef", "oleg@mail.com", "+79211235465", 780000, 39);
        emplArray[4] = new Employees("Anton", "engineer", "anton@mail.com", "+79219214565", 43000, 56);

        emplArray[0].info();

        for (int i = 0; i < emplArray.length; i++) {
            if (emplArray[i].age > 40) {
                emplArray[i].info();
            }
        }
    }
}
