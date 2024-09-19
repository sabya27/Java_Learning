import java.util.Scanner;

class Armstrongnumber {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to armstrong number calculation ");
         System.out.println("Please enter your number");
         int num = input.nextInt();
         boolean isArmstrong = isArmstrong(num);
         if (isArmstrong) {
             System.out.println("Your number is Armstrong ");
         } else {
             System.out.println( "Your number is not Armstrong");
         }
     }
     public static boolean isArmstrong (int num) {
         int numberOfDigits = numberOfDigits(num);
         int numCopy = num;

         int finalnumber = 0;
         while (num > 0) {
             int lastdigit = num % 10;
             num /= 10;
             finalnumber += power(lastdigit , numberOfDigits);

         }

         return finalnumber == numCopy;
     }
     public static int power (int num1 , int num2) {
         int result = 1;
         int i = 0;
         while (i < num2){
             result *= num1;
             i++;
         }

            return result;
     }
     public static int numberOfDigits (int num) {
         int digits = 0;
         while (num > 0) {
             digits ++ ;
             num /= 10;
         }


         return digits;
     }

}
