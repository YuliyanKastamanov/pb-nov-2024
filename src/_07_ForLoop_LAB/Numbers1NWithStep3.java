package _07_ForLoop_LAB;

import java.util.Scanner;

public class Numbers1NWithStep3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());


        //number = number + 3 -> number += 3

        for (int i = 1; i <= number ; i+=3) {

            System.out.println(i);

        }
    }
}
