import java.util.Scanner;

 class Absoluteternary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to absolute value");
        System.out.println("Please enter your number");
        int num = input.nextInt();
        int result = num >= 0 ? num : -num;
        System.out.println("Absolute value of your number is " + result);
    }
}
