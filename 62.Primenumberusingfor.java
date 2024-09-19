import java.util.Scanner;

class Primenumberusingfor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to prime number checker");
        System.out.println("Please enter the number you want to check : ");
        int num = input.nextInt();
        System.out.println();
        System.out.println("Your number is " + (isPrime(num) ? "prime" : "not prime"));


    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }


            }
            return true;
        }
    }

