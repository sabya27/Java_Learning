import java.util.Scanner;

public class Bitwiserightshift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing bitwise right case operator");
        System.out.println("Please enter your first number");
        int first = input.nextInt();
        int result =  first >> 1;

        System.out.println("Result is : " + result);
    }
}
