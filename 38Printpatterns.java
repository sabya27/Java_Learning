import java.util.Scanner;

class Printpatterns {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("We are here to print patterns\n");
         System.out.println("Please enter the number of rows: ");
         int rows = input.nextInt();
         printRightHalfPyramid(rows);
         printReverseRightHalfPyramid(rows);
         printleftHalfPyramid(rows);
     }
    public static void printleftHalfPyramid(int maxrows){
        System.out.println("\nHere is left half pyramid: ");
        int rows = maxrows;
        while (rows > 0){
            //this loop prints spaces
            int j = 0;
            while (j < rows) {
                System.out.print("  ");
                j++;
            }

            //this loop prints stars
           int i = 0;
           while (i <=( maxrows - rows)){
               System.out.print(" *");
               i++;

           }
            System.out.println();
            rows--;
        }
    }

     public static void printReverseRightHalfPyramid(int maxrows){
         System.out.println("\nHere is reverse right half pyramid: ");
         int rows = maxrows;
         while (rows > 0){
             int i = 0;
             while (i < rows){
                 System.out.print(" *");
                 i++;
             }

             System.out.println();
             rows--;
         }
     }
     public static void printRightHalfPyramid(int maxrows) {
         System.out.println("\nHere is right half pyramid: ");
         int rows = 0;
         while (rows < maxrows) {
             System.out.print("*");
             int i = 0;
             while (i < rows) {
                 System.out.print(" *");
                 i++;
             }
             System.out.println();
             rows++;
         }
     }
}
