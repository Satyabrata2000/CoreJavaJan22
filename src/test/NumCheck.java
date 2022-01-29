package test;

import java.util.Scanner;

public class NumCheck {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number ");

        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is an even number");
        } else {
            System.out.println(number + " is an odd number");
        }
        scanner.close();
    }
}

