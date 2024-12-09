package _12_NestedLoops_EXERCISE;

import java.util.Scanner;

public class CinemaTickets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalTicketsCount = 0;
        int studentTicketCount = 0;
        int standardTicketCount = 0;
        int kidsTicketCount = 0;

        String command = scanner.nextLine();
        while (!command.equals("Finish")) {
            String movieName = command;
            int freeSeats = Integer.parseInt(scanner.nextLine());
            int ticketsSoldCounter = 0;

            String endCommand = scanner.nextLine();
            while (!endCommand.equals("End")) {
                String ticketType = endCommand;

                totalTicketsCount++;
                ticketsSoldCounter++;

                switch (ticketType) {
                    case "student" -> studentTicketCount++;
                    case "standard" -> standardTicketCount++;
                    case "kid" -> kidsTicketCount++;
                }

                if (ticketsSoldCounter == freeSeats) {
                    break;
                }

                endCommand = scanner.nextLine();
            }

            System.out.printf("%s - %.2f%% full.%n", movieName, 1.0 * ticketsSoldCounter / freeSeats * 100);
            command = scanner.nextLine();
        }

        System.out.printf("Total tickets: %d%n" +
                        "%.2f%% student tickets.%n" +
                        "%.2f%% standard tickets.%n" +
                        "%.2f%% kids tickets.",
                totalTicketsCount,
                1.0 * studentTicketCount / totalTicketsCount * 100,
                1.0 * standardTicketCount / totalTicketsCount * 100,
                1.0 * kidsTicketCount / totalTicketsCount * 100
        );
    }
}
