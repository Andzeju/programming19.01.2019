package pl.sda.recap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2Demo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        String input ;

        while(true) {
            System.out.println("Podaj liczbę całkowitą:");
            input = scan.nextLine();

            if (input.toLowerCase().equals("q")) {
                break;
            }

            int numberToCheck = 0;


            try {
                numberToCheck = Integer.parseInt(input);
                String message = numberToCheck % 2 == 0 ? "parzysta" : "nieparzysta";
                System.out.println(String.format("Liszba jest %s", message));
                checkingEvenOfNumber(numberToCheck);
            } catch (NumberFormatException e) {
                System.out.println("złe dane żeś dał");
//                break;
            }


//            System.out.println(numberToCheck);
        }
    }

    static void checkingEvenOfNumber(int number) {
        if (number % 2 == 0) {
            System.out.println("Liczba jest parzysta");

        } else System.out.println("Liczba jest nieparzysta");
    }
}