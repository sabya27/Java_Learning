import java.util.Scanner;

public class Greatestofthreenumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to greatesr number calculator");
        System.out.println("Please enter your first number : ");
        int num1 = input.nextInt();
        System.out.println("Now , enter your second number : ");
        int num2 = input.nextInt();
        System.out.println("Now ,enter your third number: ");
        int num3 = input.nextInt();
        if (num1 >= num2 && num1>= num3){
            System.out.println("First number is the greatest number : " );
        } else if (num2 >= num3){
            System.out.println("Second number is the greatest number : " );
        }else{
            System.out.println("Third number is the greatest number : 8" );

        }

    }
}
