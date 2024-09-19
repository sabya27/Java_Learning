import java.util.Scanner;

class Evenorodd {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Odd Even checker");
         System.out.println("Please enter your number");
         int num = input.nextInt();
         String result = num % 2 == 0 ? "Even" : "Odd";
         System.out.println("Your number is " + result);
     }
}
