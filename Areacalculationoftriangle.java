import java.util.Scanner;

public class Areacalculationoftriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to area calculator ");
        System.out.println("Please enter your base in cms : ");
        double base = input.nextDouble();
        System.out.println("Please enter your height is cms : ");
        double height = input.nextDouble();
        double area = 0.5 * base * height ;
        System.out.println("Area of the triangle is :" + area + "cm");

    }
}
