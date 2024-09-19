import java.util.Scanner;

public class Bitwisexor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing bitwise xor operator");
        System.out.println("Please enter your first number");
        int first = input.nextInt();
        System.out.println("Now please enter your second number");
        int second = input.nextInt();
        int result = first ^ second ;
        System.out.println("Result is : " + result);
    }
}
