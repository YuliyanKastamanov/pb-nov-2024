package _07_FoorLoop_LAB;

import java.util.Scanner;

public class CharacterSequence_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {


            System.out.println(input.charAt(i));

        }
    }
}
