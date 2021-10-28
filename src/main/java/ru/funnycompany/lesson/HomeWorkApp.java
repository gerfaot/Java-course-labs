package ru.funnycompany.lesson;


public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign(2, -3);
        printColor(150);
        compareNumbers(2, 5);
        System.out.println(tenTwenty(25, 15));
        posOrNeg(25);
        System.out.println(isNegative(-25));
        printLine("asdfasdf", 6);
        System.out.println(isLeapYear(1987));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2004));
        System.out.println(isLeapYear(1900));
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(int a, int b) {
        System.out.println((a + b) >= 0? "sum is positive" : "sum is negative");
    }

    public static void printColor(int value) {
        System.out.println(value <= 0 ? "red": value > 0 && value <= 100 ? "yellow" : "green");
    }

    public static void compareNumbers(int a, int b){
        System.out.println(a >= b ? "a>=b" : "a<b");
    }

    public static boolean tenTwenty(int a, int b){
        return ((a + b) > 10 && (a + b) < 20);
    }

    public static void posOrNeg(int a){
        System.out.println(a >= 0 ? "positive" : "negative");
    }

    public static boolean isNegative(int number){
        return number >= 0;
    }

    public static void printLine(String important, int a){
        for(int i = 0; i <= a; i++){
            System.out.println(important);
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
    }
}
