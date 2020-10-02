package Johansson;

import java.util.Scanner;

public class Main {
    public static void primeNum(int checkPrimeNumb){
        String primeNumbers = "";
        if (checkPrimeNumb <= 1) {
            System.out.println("The maximum value you entered is too low");
            System.exit(0);

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

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int checkPrimeNumb = 0;
        System.out.print("Please enter a maximum number of primenumber you would like to print out: ");

        try {
            checkPrimeNumb = scan.nextInt();
        } catch (Exception e) {
            System.out.println("Error\nInvalid format\nYou have to enter a number");
            System.exit(0);

        }
        scan.close();
        String primeNumbers = "";
        if (checkPrimeNumb <= 1) {
            System.out.println("The maximum value you entered is too low");
            System.exit(0);

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

        }
        System.exit(0);
    }
}
