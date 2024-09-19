import java.util.Scanner;

class Leastcommonmultiplenumber {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to least common multiple calculator");
         System.out.println("Please enter your first number: ");
         int num1 = input.nextInt();
         System.out.println("Now enter your second number : ");
         int num2 = input.nextInt();
         int lcm = lcm(num1 , num2);
         System.out.println("LCM of the two numbers is : " + lcm);
     }
     public static int lcm (int num1 , int num2) {
         int i = 1;
         while (i <= num2) {
             int factor = num1 * i;
             if (factor % num2 == 0){
                 return factor;
             }
             i++;
         }
        ;return 0;

     }


}
