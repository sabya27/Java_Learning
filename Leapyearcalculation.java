import java.util.Scanner;

public class Leapyearcalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the leap year calculator  " );

        System.out.println("Please enter the year :"    );
        int year = input.nextInt();
        if (year % 400 ==0 || (year % 4 ==0 && year % 100 !=0) ){
            System.out.println("Your year is leap year ");

        }else {
            System.out.println("Your year is not a leap year");
        }
        }
    }


