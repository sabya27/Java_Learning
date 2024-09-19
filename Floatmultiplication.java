import java.util.Scanner;

public class Floatmultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to floating calculator");
        System.out.println("Please enter the first decimal number : " );
        double first = input.nextFloat();
        System.out.println("Please enter second decimal number");
        double second = input.nextFloat();
        System.out.println("Multiplication is : " + first*second);
        System.out.println("Addition is : " + (first+second));

    }
}
