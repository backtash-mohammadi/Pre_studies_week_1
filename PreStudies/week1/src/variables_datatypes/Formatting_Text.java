package variables_datatypes;

/* TODO:

    Write a Java program, which reads an input string and formats it according to the following rules.
    A word starting preceded and followed by _ will be displayed in all uppercase letters. (e.g. _Academy_).
    A word wrapped in # will be displayed in all lowercase letters. (e.g. #Academy#).
    Words without formatting symbols remain unchanged.
    The formatting symbols are not printed.

Example:
    "Everybody _said_, it can't be done. Then came one who did not #KNOW# that and just made it."
    will be converted to:
    "Everybody SAID, it can't be done. Then came one who did not know that and just made it."
 */

import java.util.Scanner;

public class Formatting_Text {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String sentence = input.nextLine();

        while (sentence.contains("_")) {
            // find the positions of _ in the sentence
            int startIndex = sentence.indexOf("_");
            int endIndex = sentence.indexOf("_", startIndex + 1); // which each loop it moves forward

            // Make sure both underscores are found
            // NOTE -1 means the word or _ is not found
            if (startIndex != -1 && endIndex != -1) {
                String extracted = sentence.substring(startIndex + 1, endIndex);

                // converted the word to UpperCase
                String replaced = extracted.toUpperCase();

                // substitute the word in the sentence
                // so copy from index 0 till the targeted startIndex,
                // add the replaced word and then add the rest of the
                // sentence from the last (endindex ) +1 while we want in space aswell
                sentence = sentence.substring(0, startIndex) + replaced + sentence.substring(endIndex + 1);
            } else {
                // If there's an unmatched underscore, break to avoid infinite loop
                break;
            }
        }


        // same as above
        while (sentence.contains("#")) {

            int startIndex = sentence.indexOf("#");
            int endIndex = sentence.indexOf("#", startIndex + 1);

            if (startIndex != -1 && endIndex != -1) {
                String extracted = sentence.substring(startIndex + 1, endIndex);
                String replaced = extracted.toUpperCase();
                sentence = sentence.substring(0, startIndex) + replaced + sentence.substring(endIndex + 1);
            } else {
                break;
            }

        }

        System.out.println(sentence);
    }
}
