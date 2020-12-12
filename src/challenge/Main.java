package challenge;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // here we go..
        System.out.println("The application is running.");
        Utilities util = new Utilities();
        String output = util.removePairs("AABCDDEFF");
        System.out.println("\nremoved pairs: " + output);

        // checking util.everyNthChar() method
        System.out.println("\n=== challenge #4 ===");
        char[] sourceArray = {'h', 'e', 'l', 'l', 'o'};
        char[] outputChallenge = util.everyNthChar(sourceArray, 2);
        System.out.println(Arrays.toString(sourceArray) + ", '2' nth Char: " + Arrays.toString(outputChallenge));
        char[] outputChallenge5 = util.everyNthChar(sourceArray, 6);
        System.out.println(Arrays.toString(sourceArray) + ", '6' nth Char: " + Arrays.toString(outputChallenge5));

        // nullIfOddLength() method
        System.out.println("\n=== challenge #6 ===");
        System.out.println(util.nullIfOddLength("tests"));

        // converter() method
        System.out.println("\n=== challenge #7 ===");
        System.out.println(util.converter(10, 5));

        // converter() method
        System.out.println("\n=== challenge #8 ===");
        System.out.println(util.converter(10, 0));

        System.out.println("\n=== challenge #10 ===");

    }
}
