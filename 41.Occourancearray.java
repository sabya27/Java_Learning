import java.util.Scanner;

 class Occourancearray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to array occurances");
        int [] numArray= Arrayutility.inputArray();
        System.out.println("Please enter the number you want to find : ");
        int num = input.nextInt();
        int occurances = numberOfOccurances(numArray , num);
        System.out.println("Your element was found " + occurances + " times in the array");
    }
    public static int numberOfOccurances(int[] numArray , int num){
        int occ = 0;
        int i=0;
        while (i < numArray.length) {
            if (numArray[i] == num){
                occ++;
            }

            i++;
        }
        return occ;
    }
}
