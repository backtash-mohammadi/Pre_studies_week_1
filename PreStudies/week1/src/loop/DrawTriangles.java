package loop;
import java.util.Scanner;

public class DrawTriangles {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Ask for triangle size
            System.out.print("Enter the size of the triangles: ");
            int size = scanner.nextInt();

            // Ask for number of triangles
            System.out.print("How many triangles would you like? ");
            int count = scanner.nextInt();

            // Validate inputs
            if (size <= 0 || count <= 0) {
                System.out.println("Please enter a number greater than zero for both size and number of triangles.");
            } else {
                // This loop determines how many triangles to print.
                for (int t = 0; t < count; t++) {
                    // This loop determines how many rows each triangle should have.
                    for (int i = 1; i <= size; i++) {
                        // This loop prints number of * on each line.
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter integer values only.");
        } finally { // makes sure if an exception occurs the exception still closes 
            scanner.close();
        }
    }
}
