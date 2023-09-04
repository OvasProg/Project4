package Part1;
//Java program to demonstrate nested for loop

import java.util.Scanner;

public class part1_nested_for {
    public static void main(String[] args) {

        //create a new scanner
        Scanner in = new Scanner(System.in);

        System.out.println("This program will create a triangle with you side length");
        System.out.println("Input side lenght");
        int l = in.nextInt();
        in.nextLine();

        for (int i = 0; i < l/2 + l%2; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < l - i - i; k++) {
                System.out.print("0");
            }
            for (int m = 0; m < i; m++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}