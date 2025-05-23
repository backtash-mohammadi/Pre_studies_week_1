package operators;

import java.util.Scanner;

public class Time_Unites {


    /*
    TODO:

        Write a program, which divides a number of seconds (input) into its larger units.
        Enter number of seconds: 244568879
        7 years and 275 days and 15 hours and 47 minutes and 59 seconds

    NOTE:
        1 minute = 60 seconds
        1 hour = 60 minutes = 3600 seconds
        1 day = 24 hours = 86,400 seconds
        1 year = 365 days (ignore leap years for simplicity) = 31,536,000 seconds
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number in seconds to convert: ");
        int dig = input.nextInt();

        int min = dig / 60;
        int hour = min / 60;
        int day = hour / 24;
        int year = day / 365;

        // Use modulo (%) to get leftover units after extracting the bigger ones
        int daysLeft = day % 365;
        int hoursLeft = hour % 24;
        int minutesLeft = min % 60;
        int secondsLeft = dig % 60;

        System.out.print(year+ " years, "+ daysLeft + " days, " +
                hoursLeft + " hours, " + minutesLeft + " minutes, "+ secondsLeft + " seconds");
    }

}
