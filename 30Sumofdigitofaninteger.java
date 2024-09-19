import java.util.Scanner;
class Sumofdigitofaninteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the digit calculator");
        System.out.println("Please enter your number : ");
        int num = input.nextInt();
        int sum = sumofdigits(num);
        System.out.println("Sum of digits is  : " + sum);
    }
    public static int sumofdigits(int num) {
        int sum =0;
        while (num > 0){
            sum = sum + (num % 10);
            num = num / 10;

        }
        return sum;
    }
}
