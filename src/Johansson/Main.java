package Johansson;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void primeNum(int checkPrimeNumb) {    //this method will use the user unput and print out all prime numbers below the input
        String primeNumbers = "";
        if (checkPrimeNumb <= 1) {  //there is no primeNums below 2
            System.out.println("The maximum value you entered is too low");

        } else {
            for (int i = 2; i <= checkPrimeNumb; i++) {
                int counter = 0;
                for (int j = i; j >= 1; j--) {
                    if (i % j == 0) {
                        counter = counter + 1;
                    }
                }
                if (counter == 2) {
                    primeNumbers = primeNumbers + i + " ";
                }
            }
            System.out.println("Prime numbers with the maximum of " + checkPrimeNumb + " is the below:\n" + primeNumbers);
        }
    }

    public static void askForNum() {
        System.out.print("Please enter a maximum number of primenumber you would like to print out: ");
        int checkPrimeNumb = 0;
        try {
            checkPrimeNumb = scan.nextInt();
        } catch (Exception e) {
            System.out.println("Error\nInvalid format\nYou have to enter a number");
            //System.exit(4);
        }
        primeNum(checkPrimeNumb);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        askForNum();
        // int checkPrimeNumb = 0;
        //primeNum(checkPrimeNumbers);

        //primeNum(checkPrimeNumbers);

        String playAgain = "";
        boolean continunePlaying = true;
        while (continunePlaying) {
            System.out.print("Would you like to enter another number: [Y]");
            try {
                playAgain = scan.nextLine();
            } catch (Exception e) {
                System.out.println("Error\nInvalid format\nYou have to enter a number");
                System.exit(2);
            }
            playAgain.toLowerCase();
            if (playAgain.equals("y")) {
                askForNum();
            } else {
                continunePlaying = false;
                System.exit(1);
            }
        }
    }
}