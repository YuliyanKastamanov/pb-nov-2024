package _12_NestedLoops_EXERCISE;

import java.util.Scanner;

public class NumberPyramid_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int numCounter = 1;

        for (int rows = 1; rows <= n; rows++) {

            for (int columns = 1; columns <= rows; columns++) {
                System.out.print(numCounter++ + " ");

                if (numCounter > n) {
                    break;
                }
            }
            if (numCounter > n) {
                break;
            }
            System.out.println();
        }

    }
}
