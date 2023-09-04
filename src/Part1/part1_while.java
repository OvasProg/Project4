package Part1;
//Java program to demonstrate while loop

import java.util.Scanner;

public class part1_while {
    public static void main(String[] args) {

        //create a new scanner
        Scanner in = new Scanner(System.in);

        int real_password = 12345679, your_password = 0;

        System.out.println("Input your password");
        your_password = in.nextInt();
        in.nextLine();


        while (your_password != real_password) {
            System.out.println("Password is incorrect");
            System.out.println("Try one more time");
            your_password = in.nextInt();
            in.nextLine();
        }

        System.out.println("Password is correct");

    }
}