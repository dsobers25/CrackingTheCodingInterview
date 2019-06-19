// Implement an algorithm to determine if a string has all unique characters
// What if you can not use additional data structures?

import java.util.Scanner;

public class Question1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter in a String");
        String input =  sc.next();
        boolean duplicate = false;

        boolean[] char_set = new boolean[255];

        for (int i = 0; i < input.length(); i++) {

            int val = input.charAt(i);

            if (char_set[val]){

                duplicate = true;
                System.out.printf("There are duplicate characters in String  %s ", input);
                break;
            }

            char_set[val] = true;

        }

        if (duplicate == false) {
            System.out.printf("There are no duplicate characters in String %s", input);
        }

    }
}
