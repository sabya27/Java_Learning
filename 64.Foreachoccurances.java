import java.util.Scanner;

class Foreachoccurances {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to array occurances");
         int[] arr = inputArray();
         System.out.println("Now,enter the number you want to search : ");
         int element = input.nextInt();
         int occ = countOccurrences(arr, element);
         System.out.println("Your element was found: " + occ + " times.");






     }
    public static int countOccurrences(int[] arr, int element) {
        int occ = 0;
        for (int num : arr) {
            if (num == element) {
                occ++;
            }
        }
        return occ;
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
