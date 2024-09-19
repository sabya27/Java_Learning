import java.util.Scanner;

class Fibonacciseries {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to fibonacci series");
         System.out.println("Please enter your number: ");
         int num = input.nextInt();
         System.out.println("Here is the fibonacci series");
         printfibonacci(num);
     }
     public static void printfibonacci (int num){
         if (num < 0) return;
         System.out.println("0 ");
         if (num == 0) return;;
         System.out.println("1 ");

       int first = 0 ,second = 1;
       while (first + second <= num) {
           int third = first + second;
           System.out.println(third + "");
           first = second ;
           second = third;

       }

    }
}
