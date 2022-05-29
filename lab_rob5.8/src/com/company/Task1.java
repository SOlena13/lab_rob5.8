package com.company;

import java.util.Scanner;

public class Task1 {
    public Task1() {
    }

    public static void main(String[] args) {
        Scanner cman = new Scanner(System.in);
        System.out.println("Введіть число:");
        int b = cman.nextInt();
        if (b > 50 & 100 > b) {
            System.out.println("Число " + b + " знаходиться в проміжку (50; 100)");
        } else {
            System.out.println("Число " + b + " не знаходиться в проміжку (50; 100)");
        }

    }
}