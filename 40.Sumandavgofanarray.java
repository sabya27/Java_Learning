import java.util.Scanner;

class Sumandavgofanarray {
     public static void main(String[] args) {

         System.out.println("Welcome to array sum and average");
         int [] numArray=Arrayutility.inputArray();

         long sum=sum(numArray);
         double average = average(numArray);
         System.out.println("Sum of your numbers is : " + sum);
         System.out.println("Average of your number is : " + average);

     }

     public static long sum (int [] numArray){
         long sum = 0;
         int i = 0;
         while (i < numArray.length){
             sum= sum + numArray[i];

             i++;
         }



         return sum;
     }
     public static double average(int [] numArray){
         double sum = sum(numArray);

         return  (sum/numArray.length);
     }

}
