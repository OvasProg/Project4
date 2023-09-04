package Part1;
//Java program to demonstrate do while loop

import java.util.Scanner;

public class part1_do {
    public static void main(String[] args) {

        //create a new scanner
        Scanner in = new Scanner(System.in);

        System.out.println("This program raises your number to a power until you print 'stop'");
        System.out.println("Input your number");
        int your_number = in.nextInt();
        in.nextLine();
        long number = your_number;

        boolean stop = false;
        int power = 1;
        do{
            System.out.print("The " + power + " power of your number is: ");
            System.out.println(number);
            power ++;
            number *= your_number;
            System.out.println("You want to stop (true / false ?)");
            stop = in.nextBoolean();
        } while(!stop);
    }
}
