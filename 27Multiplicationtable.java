import java.util.Scanner;

class Multiplicationtable {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to Multiplication World");
         System.out.println("Please enter your number : ");
         int num = input.nextInt();
         printMultiplicationTable(num);


     }

     public static void printMultiplicationTable(int num) {
         int i = 1;
         while (i <= 10) {
             System.out.println(num + "X" + i + "=" + (num * i));
             i +=1 ;
           ;
         }

     }
}
