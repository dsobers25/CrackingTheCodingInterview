// Write code to reverse a C-Style String
// (C-String means that “abcd” is represented as five characters, including the null character )

import java.util.Scanner;

public class Question1_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter in some characters");

        String word = scan.next();

        for (int x = word.length() - 1; x >= 0; x--) {
            System.out.print(word.charAt(x));

        }

    }

}
