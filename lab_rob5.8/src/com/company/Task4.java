
package com.company;

import java.util.Scanner;

public class Task4 {
    public Task4() {
    }
    public static void main(String[] args) {
        System.out.println("'Ні', 'NO', 'N', '-', 'No' або ці 'Так', 'ОК', 'Yes', 'Y', '+', 'Ok' ");
        Scanner skan = new Scanner(System.in);
        String b = skan.nextLine();
        byte var4 = -1;
        switch(b.hashCode()) {
            case 43:
                if (b.equals("+")) {
                    var4 = 9;
                }
                break;
            case 45:
                if (b.equals("-")) {
                    var4 = 3;
                }
                break;
            case 78:
                if (b.equals("N")) {
                    var4 = 2;
                }
                break;
            case 89:
                if (b.equals("Y")) {
                    var4 = 8;
                }
                break;
            case 2497:
                if (b.equals("NO")) {
                    var4 = 1;
                }
                break;
            case 2524:
                if (b.equals("OK")) {
                    var4 = 6;
                }
                break;
            case 2529:
                if (b.equals("No")) {
                    var4 = 4;
                }
                break;
            case 3548:
                if (b.equals("ok")) {
                    var4 = 10;
                }
                break;
            case 33753:
                if (b.equals("Ні")) {
                    var4 = 0;
                }
                break;
            case 88775:
                if (b.equals("Yes")) {
                    var4 = 7;
                }
                break;
            case 1051052:
                if (b.equals("Так")) {
                    var4 = 5;
                }
        }

        switch(var4) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Я відмовляюся!");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("Я погоджуюся!");
                break;
            default:
                System.out.println("Вірне значення");
        }

    }
}

