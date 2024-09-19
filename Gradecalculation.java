import java.util.Scanner;

public class Gradecalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the grade calculator");
        System.out.println("Please enter the marks in % you have secured :");
        int marks = input.nextInt();
        if (marks >=90){
            System.out.println("You have A grade in your exam");
        } else if (marks >= 75 ){
            System.out.println("You have B grade in your exam");
        }else if (marks >= 60  ){
            System.out.println("You have C grade in your exam");
        }else if (marks >= 30 ){
            System.out.println("You have D grade in your exam");
        }else if (marks <= 30){
            System.out.println("You have F grade in your exam");
        }
    }
}
