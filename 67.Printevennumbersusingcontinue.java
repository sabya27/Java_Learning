import java.util.Scanner;

 class Printevennumbersusingcontinue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);




       //FOR EVEN NUMBERS UPTO SPECIFIC NUMBER
//        for (int i = 1; i <= 100; i++) {
//            if (i % 2 == 1) {
//                continue;
//            }
//            System.out.println(i);
//        }


      // FOR SCANNER NUMBERS


        int[] arr = inputArray();

        System.out.println("Even numbers of your array is : ");
//
        for (int num : arr) {
            if (num % 2 == 1) {
                continue;
            }

            System.out.print ( num + " ");


        }


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
