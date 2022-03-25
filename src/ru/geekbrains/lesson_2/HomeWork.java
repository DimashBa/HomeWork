package ru.geekbrains.lesson_2;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {


        static boolean doOne ( int a, int b;){
            int sum = a + b;
            if (sum > 10 && sum < 20) return true;
            else return false;
        }
    }

    static void doTwo(int a) {
        if (a >= 0) System.out.println("Число " + a + "положительное");
        else System.out.println("Число " + a + " отрицательное");
        System.out.println(a = 5);
    }

    public static boolean methodD(int a) {
        if (a < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }

        public static void methodF ( int year){
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println("Год высокосный");
            } else {
                System.out.println("Год не высокосный");
            }
        }
    }
}

