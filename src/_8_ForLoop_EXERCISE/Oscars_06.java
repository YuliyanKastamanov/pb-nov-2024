package _8_ForLoop_EXERCISE;

import java.util.Scanner;

public class Oscars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double actorPoints = Double.parseDouble(scanner.nextLine());
        int gradersCount = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= gradersCount; i++) {
            String graderName = scanner.nextLine();
            double graderPoints = Double.parseDouble(scanner.nextLine());

            actorPoints += graderName.length() * graderPoints / 2;

            if (actorPoints >= 1250.5) {
                break;
            }
        }

        if (actorPoints >= 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!",
                    actorName, actorPoints);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!", actorName, 1250.5 - actorPoints);
        }
    }
}
