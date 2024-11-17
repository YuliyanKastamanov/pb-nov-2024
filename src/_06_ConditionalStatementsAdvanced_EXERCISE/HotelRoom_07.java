package _06_ConditionalStatementsAdvanced_EXERCISE;

import java.util.Scanner;

public class HotelRoom_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nightsCount = Integer.parseInt(scanner.nextLine());

        double studioPrice = 0.0;
        double apartmentPrice = 0.0;

        switch (month) {
            case "May", "October" -> {
                studioPrice = 50.0 * nightsCount;
                apartmentPrice = 65.0 * nightsCount;

                if (nightsCount > 7 && nightsCount <= 14) {
                    studioPrice = studioPrice - (studioPrice * 0.05);
                    // studioPrice = studioPrice * 0.95;
                } else if (nightsCount > 14) {
                    studioPrice = studioPrice - (studioPrice * 0.30);
                    // studioPrice = studioPrice * 0.70;
                    apartmentPrice = apartmentPrice - (apartmentPrice * 0.10);
                }
            }
            case "June", "September" -> {
                studioPrice = 75.20  * nightsCount;
                apartmentPrice = 68.70 * nightsCount;

                if (nightsCount > 14) {
                    studioPrice = studioPrice - (studioPrice * 0.20);
                    apartmentPrice = apartmentPrice - (apartmentPrice * 0.10);
                }
            }
            case "July", "August" -> {
                studioPrice = 76.0  * nightsCount;
                apartmentPrice = 77.0 * nightsCount;

                if (nightsCount > 14) {
                    apartmentPrice = apartmentPrice - (apartmentPrice * 0.10);
                }
            }
        }

        System.out.printf("Apartment: %.2f lv.%n" +
                "Studio: %.2f lv.", apartmentPrice, studioPrice);

    }
}
