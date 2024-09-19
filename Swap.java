import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Swap two numbers");
        System.out.print("Enter value of A");

        int a = input.nextInt();
        System.out.println("Enter value of B");

      int b = input.nextInt();
        int c = a;
         a = b;
         b = c;
        System.out.println("Swapping is done...");
        System.out.println("Value of a is:" + a );
        System.out.println("Value of b is: " + b);
    }
}
