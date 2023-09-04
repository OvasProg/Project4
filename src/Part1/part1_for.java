package Part1;
//Java program to demonstrate for loop

import java.util.Scanner;

public class part1_for {
    public static void main(String[] args) {

        //create a new scanner
        Scanner in = new Scanner(System.in);

        for(int i = 0; i < 10; i++){
            System.out.print(i + " ");
        }
        System.out.println();

        for(int j = 1000; j > 990; j--){
            System.out.print(j + " ");
        }
        System.out.println();

    }
}
