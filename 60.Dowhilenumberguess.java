import java.util.Scanner;

class Dowhilenumberguess {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to number guessing game");
//         System.out.println("Please enter your number: ");
//         int num = input.nextInt();



          int num = 5;
         int guess;
         do {
             System.out.print("Please guess the number between 0 and 10: ");
             guess = input.nextInt();
         }while (num != guess);
         System.out.println("You have successfully guessed the number");
     }
}
