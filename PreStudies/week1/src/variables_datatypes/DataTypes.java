package variables_datatypes;

public class DataTypes {
    public static void main(String [] args){

        //1. Initials
        char initials= 'B'; // each letter takes 2 bytes

        //2. Population in Germany
        int population = 83_000_000;

        //3. Population on earth - doesn't fit in int
        long earth_population = 8_000_000_000L;

        //4. Is currently daytime?
        boolean isDaytime = true;

        // 5. Goal strike quote (goals per game) of Mario Gomez at Bayern München - float is smaller than double
        float goalStrikeQuote = 0.6f;

        //6. Length of the java program in weeks
        byte programLengthWeeks = 6;

        //7. The mathematical number PI - NOTE float allows only 6 digits after the point
        float pi = 3.1415926f;



        System.out.println("Initials: "+initials);
        System.out.println("Population of Germany: "+population);
        System.out.println("Population of the world: "+ earth_population);
        System.out.println("Is it currently daytime? " + isDaytime);
        System.out.println("Mario Gomez goal strike quote: " + goalStrikeQuote + " goals per game");
        System.out.println("Length of the Java program: " + programLengthWeeks + " weeks");
        System.out.println("PI: " + pi);
    }
}
