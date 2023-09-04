package Part1;
/*
Java program to iterate through string
and print each character of the String in every new line
 */


import java.util.Scanner;

public class part1_for_string {
    public static void main(String[] args) {

        //create a new scanner
        Scanner in = new Scanner(System.in);

        System.out.println("Input your string");
        String s = in.nextLine();
        System.out.println("Characters of your string: ");

        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }

    }
}
