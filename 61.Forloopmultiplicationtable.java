import java.util.Scanner;

 class Forloopmultiplicationtable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the multiplication table");
        System.out.println("Please enter your number you want to print table of : " );
        int num = input.nextInt();
        int i = 1;




        for (i = 1; i <= 10 ; i++){
            System.out.println( num + "X" + i + "=" + (num * i));
        }
    }
}
