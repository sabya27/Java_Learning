import java.util.Scanner;

class Minof2number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to number checker");
        System.out.println("Please enter your number");
        int num1 = input.nextInt();
        System.out.println("Now , enter your second number");
        int num2 = input.nextInt();
        int smallestNumber=num1 < num2 ?  num1 : num2;
        System.out.println(smallestNumber + " is the minimum of two numbers");

    }
}
