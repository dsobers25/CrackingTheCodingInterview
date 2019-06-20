// Implement an algorithm to determine if a string has all unique characters  What if you can not use additional data structures?

public class Question1Sol {

    public static boolean isUniqueChars(String str) {

        // created a boolean array of 255 indices set to false by default
        // this array is set to 255 because there are 255 ASCII characters
        boolean[] char_set = new boolean[255];

        // for loop iterates through the string passed
        for (int i = 0; i < str.length(); i++) {

            // integer val is assigned to the ASCII
            // value of the character at index i
            int val = str.charAt(i);

            // if the value at char_set is true, this means that
            // character was previously seen and will return false
            // ultimately terminating this loop
            if (char_set[val]) return false;

            // val is a integer value equal to the ASCII value of a character
            // this index is assigned true to confirm the presence of a character
            char_set[val] = true;
        }
        return true;
    }

    public static void main(String[] args) {
        // Character 'c' is ASCII value 99
        // Character 'o' is ASCII value 111
        // Character 'd' is ASCII value 100
        // Character 'e' is ASCII value 101
        // Character 'd' is ASCII value 100

        // this string is assigned a value of the word 'coded'
        String a = "coded";

        // Because character 'd' is located in this string index 100 which
        // is the ASCII value for 'd' will be set to equal true.
        // the if statement in isUniqueChars() will check index 100 for a second time
        // and return false because it was previously set to true

        if (isUniqueChars(a)) {
            System.out.printf("There are no duplicate characters in the String %s", a);
        } else {
            System.out.printf("There are duplicate characters in the String %s", a);
        }

    }
}
