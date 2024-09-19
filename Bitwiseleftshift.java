import java.util.Scanner;

public class Bitwiseleftshift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing bitwise left case operator");
        System.out.println("Please enter your first number");
        int first = input.nextInt();
        int result =  first << 1;

        System.out.println("Result is : " + result);
    }
}

