package operators;

/*
    TODO: Imagine, you need to calculate the amount of sheet metal to produce food cans.
     A user will enter the circumference c and the height h of the cans.
     Calculate the area of the geometrical cylinder.

        Diameter d of the lid: d = c / pi, where pi = 3,14
        Area of the lid: al = pi ( d / 2 ) ( d / 2 )
        Area of the casing: ac = c * h
        Total required sheet area: at = 2 * al + ac

        What is the volume of the can?
        Circumference: 32
        Height: 10

        SOLUTION:
        Sheet metal area: 482.97946840681203
        Volume: 814.8973420340601
 */



public class Cylinder {

    public static void main(String[] args) {

        double c = 32; // circumference
        double h = 10; // height


        // Diameter d of the lid: d = c / pi
        double d = c / Math.PI;

        // Area of the lid: al = pi ( d / 2 ) ( d / 2 )
        double al = Math.PI *(d/2) * (d/2);

        // Area of the casing: ac = c * h
        double ac = c * h;

        // Total required sheet area: at = 2 * al + ac
        double result = 2 * al + ac;

        // Calculate volume of the cylinder al * h;
        double volume = al * h;


        System.out.println("Area of the Cylinder: "+result);
        System.out.println("Volume of the Cylinder: "+volume);
    }


}
