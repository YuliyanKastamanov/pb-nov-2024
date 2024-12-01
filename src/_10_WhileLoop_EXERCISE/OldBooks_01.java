package _10_WhileLoop_EXERCISE;

import java.util.Scanner;

public class OldBooks_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String annysBook = scanner.nextLine();

        int booksCounter = 0;

        String currentBook = scanner.nextLine();

        while (!currentBook.equals(annysBook)) {

            if (currentBook.equals("No More Books")) {
                break;
            }

            booksCounter++;
            currentBook = scanner.nextLine();
        }


        if (currentBook.equals(annysBook)) {
            System.out.printf("You checked %d books and found it.", booksCounter);
        } else {
            System.out.printf("The book you search is not here!%n" +
                    "You checked %d books.", booksCounter);
        }

    }
}
