//Simple dialog with loop

import java.util.Scanner;

public class part2 {
    public static void main(String[] args) {

        //create a new scanner
        Scanner in = new Scanner(System.in);

        System.out.println("This program will print your string in upper case");

        while(true){
            System.out.println("Input your string");
            String s = in.nextLine();
            System.out.println(s.toUpperCase());

            System.out.println("Type Y/y to continue");
            System.out.println("Type any other character to quit");
            String c = in.nextLine();
            if (!c.toLowerCase().equals("y")){
                break;
            }
        }

    }
}
