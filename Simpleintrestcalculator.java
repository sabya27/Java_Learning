import java.util.Scanner;

public class Simpleintrestcalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to simple intrest calculator");
        System.out.println("Please enter the principal amount Rs : " );
        double principle = input.nextDouble();
        System.out.println("Now, tell me your rate of intrest : " );
        float rate = input.nextFloat();
        System.out.println("Now,please tell me for how many years you are borrowing this money : " );
        float years = input.nextFloat();
        double simpleintrest = (principle * rate * years ) / 100 ;
        System.out.println("Simple intrest of yor amount is : " + simpleintrest + "Rs");
    }
}
