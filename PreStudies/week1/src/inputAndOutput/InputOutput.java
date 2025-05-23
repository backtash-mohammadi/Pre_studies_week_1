package inputAndOutput;

import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args){
        long start = System.currentTimeMillis();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name= input.nextLine();
        System.out.println("Hello "+ name +", Welcome to the Training");

        long end = System.currentTimeMillis();
        System.out.println("Execution time: " + (end - start) + " ms");

    }
}
