import java.util.Scanner;

class Sumodd {
     public static void main(String[] args) {
         Scanner inout = new Scanner(System.in);
         System.out.println("Welcome to Odd sum");
         System.out.println("Please enter your number : ");
         int num = inout.nextInt();
         int sum = oddSum(num);
         System.out.println("OddSum till " + num + " is " + sum);
     }
     public static int oddSum (int num) {
         int sum = 0;
         int i = 1;
         while (i <= num){
             sum = sum + i;
             i = i+2;
         }

         return sum;

     }
}
