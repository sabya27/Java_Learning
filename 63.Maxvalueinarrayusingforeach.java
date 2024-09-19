import java.util.Scanner;

class Maxvalueinarrayusingforeach {
    public static void main(String[] args) {
//        System.out.println("Welcome to finding the maximum\n");
//        int[] arr = Arrayutility.inputArray();
//
//        int max = Integer.MIN_VALUE;
//        for (int num: arr) {
//            if (max < num) {
//                max = num;
//            }
//        }
//
//        System.out.println("Maximum number is: " + max);
        Scanner input = new Scanner(System.in);
        System.out.println("Wecome to finding the maximum number");


        int[] arr = inputArray();





        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (max < num) {
                max = num;
            }
        }
        System.out.println("Maximum number is: " + max);





    };
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
