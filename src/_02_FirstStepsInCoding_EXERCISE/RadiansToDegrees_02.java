package _02_FirstStepsInCoding_EXERCISE;

import java.util.Scanner;

public class RadiansToDegrees_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        double radians = Double.parseDouble(input);
        // градус = радиан * 180 / π

        double degrees = radians * 180 / Math.PI;

        System.out.println(degrees);
    }
}
