//Improved dialog with loop with repeating conversation

import java.util.Scanner;

public class part4 {
    public static void main(String[] args) {

        //create a new scanner
        Scanner in = new Scanner(System.in);

        while (true) {

            System.out.println("This program will print your string in reversed order");

            while (true) {
                System.out.println("Input your string");
                String s = in.nextLine();
                for (int i = s.length() - 1; i >= 0; i--) {
                    System.out.print(s.charAt(i));
                }
                System.out.println();

                System.out.println("Type Y/y to continue");
                System.out.println("Type any other character to quit");
                String c = in.nextLine();
                if (!c.toLowerCase().equals("y")) {
                    break;
                }
            }
            System.out.println("Type Y/y to repeat the whole conversation");
            System.out.println("Type any other character to quit");
            String c = in.nextLine();
            if (!c.toLowerCase().equals("y")) {
                break;
            }
        }
    }
}
