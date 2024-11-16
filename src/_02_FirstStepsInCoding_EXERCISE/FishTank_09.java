package _02_FirstStepsInCoding_EXERCISE;

import java.util.Scanner;

public class FishTank_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        int volumeInSm = width * height * length;

        // 1l = 1dm3 = 1000sm3
        // 1dm = 10sm
        // 1dm3 = 10sm * 10sm * 10sm
        // 1dm3 = 1000sm3

        double volumeInLiters = volumeInSm / 1000.0;

        double volumeToRemove = volumeInLiters * (percent/100);

        volumeInLiters = volumeInLiters - volumeToRemove;
        System.out.println(volumeInLiters);
    }
}
