import java.util.Scanner;

public class Agegroup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the age category chart");
        System.out.println("Please enter your age");
        int age = input.nextInt();
        if (age >= 60){
            System.out.println("Hey you are a senior");
        }else if (age >=20){
            System.out.println("You are an adult");
        } else if (age >=13) {
            System.out.println("You are a teen");


        } else  {
            System.out.println("You are a child");


        }

    }
}
