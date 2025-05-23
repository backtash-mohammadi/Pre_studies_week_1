package inputAndOutput;

import java.util.Scanner;

public class Geometry {

    /* NOTE:
        Rectangle:
        Area = lenght x width
        Perimeter= 2x( length + width)

        Trinangle:
        Area = 1/2 x base x height
        hypotenuse = sqrt(base^2 + height^2)
        Perimeter = base + height + hypotenuse

    */
    // Global Variables
    int area;
    int  perimeter;


    Geometry(int area, int perimeter) {
       this.area = area;
       this.perimeter = perimeter;
   }


    public static Geometry calculateRectangle() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        int length = input.nextInt();

        System.out.print("Enter the width of the rectangle: ");
        int width = input.nextInt();

        int area = length * width;
        int perimeter = 2* (length + width);

        return new Geometry(area, perimeter);
    }


    public static Geometry calculateTrinagle() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        int base = input.nextInt();

        System.out.print("Enter the height of the triangle: ");
        int height = input.nextInt();

        double hypotenuse = Math.sqrt(base * base + height * height);

        int area = (base * height)/2;
        int perimeter = base + height + (int)hypotenuse; // Casting double to int

        return new Geometry( area, perimeter);

    }



    public static void main(String [] args){
        System.out.println("========================================================");
        Geometry resultRectangle = calculateRectangle();
        System.out.println("Rectangle's area = " + resultRectangle.area);
        System.out.println("Rectangle's perimeter = " + resultRectangle.perimeter);

        System.out.println("========================================================");

        Geometry resultTrinagle = calculateTrinagle();
        System.out.println("Trinabgle's area = " + resultTrinagle.area);
        System.out.println("Trinangle's perimeter = " + resultTrinagle.perimeter);
        System.out.println("========================================================");
    }
}
