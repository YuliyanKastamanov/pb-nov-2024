package ConditionalStatements_EXERCISE;

import java.util.Scanner;

public class WorldSwimmingRecord_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double timeFor1Meter = Double.parseDouble(scanner.nextLine());

        double timeForSwimming = distanceInMeters * timeFor1Meter;

        double slowingSectors = Math.floor(distanceInMeters / 15);
        double slowingTime = slowingSectors * 12.5;

        double ivanTime = timeForSwimming + slowingTime;

        if (ivanTime < record) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", ivanTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", ivanTime - record);
        }

    }
}
