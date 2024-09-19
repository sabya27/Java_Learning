import java.util.Scanner;

class Palindromenumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to palindrome number ");
        System.out.println("Please enter your number");
        int num = input.nextInt();
        boolean isPalindrome = isPalindrome(num);
        if (isPalindrome) {
            System.out.println("Your numer is a palindrome number");
        } else {
            System.out.println("Your numer is not a palindrome number");
        }

    }

    public static boolean isPalindrome(int num) {


        return num == reverse(num);
    }

    public static int reverse(int num) {
        int newNum = 0;
        while (num > 0) {
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }
        return newNum;

    }
}

