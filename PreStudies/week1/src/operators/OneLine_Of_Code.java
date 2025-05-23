package operators;

/*
    TODO: Write the following code in a single line. The result must stay the same.
    double x = 15.5;
    double a = Math.sqrt(3.5 + x);
    double b = a * 5;
    double c = b / 3;
    double d = x + 10;
    double e = x - 4.1;
    double f = d * e;
    double g = c - f;
    System.out.println(g);
 */

public class OneLine_Of_Code {

    public static void main(String[] args) {

        System.out.println(((Math.sqrt(3.5 + 15.5) * 5) / 3) - ((15.5 + 10) * (15.5 - 4.1)));

    }
}
