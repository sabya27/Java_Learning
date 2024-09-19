import java.util.Scanner;

class CircleAreaAndCercumferance {
     double radiusInMm;

     CircleAreaAndCercumferance(double radiusInMm) {
         this.radiusInMm = radiusInMm;
     }

     double getCircumference() {
         return 2 * radiusInMm * Math.PI;
     }

     double getArea() {
         return Math.PI * Math.pow(radiusInMm, 2);
     }

     @Override
     public String toString() {
         return "Circle Props: Radius in mm: " + radiusInMm
                 + " , Circumference in mm: " + getCircumference()
                 + ", Area in mm2: " + getArea();
     }

     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to the world of Circle\n");
         System.out.print("Please enter your radius: ");
         double radius = input.nextDouble();
         CircleAreaAndCercumferance circle = new CircleAreaAndCercumferance(radius);
         System.out.println(circle);
     }
}
