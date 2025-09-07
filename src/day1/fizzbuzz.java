package day1;

import java.util.Scanner;

public class fizzbuzz {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number:");
            double x = scanner.nextDouble();
            for(int counter = 1; counter <= x; counter++) {
                if ((counter % 5 == 0) && (counter % 3 == 0)) {
                    System.out.println("FizzBuzz");
                } else {
                    if (counter % 5 == 0) {
                        System.out.println("Buzz");
                    }
                    else {
                        if (counter % 3 == 0) {
                            System.out.println("Fizz");
                        }
                    }

                }


            }

            scanner.close();


        }
    }



