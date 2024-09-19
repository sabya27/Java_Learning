import java.util.Scanner;

 class Studentsscore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Result calculator");
        System.out.println("Please enter the mark you have secured");
        int marks = input.nextInt();
      String category = marks > 80 ? "High" : (marks > 50 ?  "Moderate" : "Low");
        System.out.println("Your category is " + category);
    }
}
