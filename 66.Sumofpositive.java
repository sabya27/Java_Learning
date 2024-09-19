import java.util.Scanner;

class Sumofpositive {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to sum of positive numbers");
         int [] arr = inputArray();
         int sum = 0;
         for (int num : arr) {
             if (num < 0) {
                 continue;
             }
             sum += num;
         }
         System.out.println("The sum of positive numbers is: " + sum);


     }
    public static int[] inputArray () {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number of elements : ");
        int size = input.nextInt();
        int[] nums = new int[size];
        int i = 0;
        while (i < size) {
            System.out.println("Please enter element number " + (i + 1) + " : ");
            nums[i] = input.nextInt();
            i++;
        }
        return nums;
    }
}
