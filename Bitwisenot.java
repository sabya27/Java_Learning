import java.util.Scanner;

public class Bitwisenot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing bitwise not operator");
        System.out.println("Please enter your first number");
        int first = input.nextInt();
        int result = ~ first;
        System.out.println("Result is : " + result);

}
}
