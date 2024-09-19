import java.util.Scanner;

public class Numberispositiveornegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to number description : ");
        System.out.println("Please enter your number");
        int number = input.nextInt();
        if (number > 0) {
            System.out.println("The number is positive");
        } else if (number == 0) {
            System.out.println("The number is zero");
        } else {
            System.out.println("Your number is negative");

        }
    }
}
