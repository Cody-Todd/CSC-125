package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.print("\033[H\033[2J");
        //Clears the terminal so that everything that pops up on start disappears
        //ASCII escape code I found with a quick google

        System.out.println("Welcome to the calculator!");

        Scanner input = new Scanner(System.in);

        System.out.println("Please input your first integer:");
        int number1 = input.nextInt();

        System.out.println("Please input your second integer:");
        int number2 = input.nextInt();

        System.out.println("Please make a selection:");
        System.out.println("For addition input 1");
        System.out.println("For subtraction input 2");
        System.out.println("For multiplication input 3");
        System.out.println("For division input 4");
        int operation = input.nextInt();

        input.close();

        if (operation == 1){
            System.out.println("Your answer is:");
            System.out.println(number1 + number2);
        }

        if (operation == 2){
            System.out.println("Your answer is:");
            System.out.println(number1 - number2);
        }

        if (operation == 3){
            System.out.println("Your answer is:");
            System.out.println(number1 * number2);
        }
        
        if (operation == 4){
            System.out.println("Your answer is:");
            System.out.println(number1 / number2);
        }




    }
}