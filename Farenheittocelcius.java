import java.util.Scanner;

public class Farenheittocelcius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to temperature calculator ");
        System.out.println("Please enter your temp in F : ");
        double fah = input.nextDouble();
        double cel = (fah - 32 ) * 5.0f/9.0f;
        System.out.println("Your temperature in celcius is : " + cel + "C");

    }
}
