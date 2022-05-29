package com.company;

import java.util.Scanner;

public class Task2 {
    public Task2() {
    }

    public static void main(String[] args) {
        Scanner skan = new Scanner(System.in);
        System.out.println("Введіть ціле тризначне число: ");
        int b = skan.nextInt();
        int c = b % 100 / 10;
        int a = b / 100;
        int d = b % 10;
        int max = Math.max(a, d);
        System.out.println(Math.max(max, c));
    }
}