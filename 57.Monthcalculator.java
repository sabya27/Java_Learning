import java.util.Scanner;

 class Monthcalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to month of a year calculator");
        System.out.println("Please enter month in number : ");
        int month = input.nextInt();
        monthOfTheYear(month);
    }
    public static void monthOfTheYear(int month ){
        String monthStr = switch (month){
            case 1 -> "January";
            case 2 -> "Febuary";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid";

        };
        System.out.println(monthStr);

    }
}
