package _11_NestedLoops_LAB;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*int i = 0;
        while (i < 6) {
            i++;
            if (i % 2 == 0)
                System.out.print(i);
        }*/


        for (int hour = 0; hour <= 23; hour++) {
            System.out.printf("It's %d o'clock%n", hour);

            for (int minutes = 0; minutes <= 59 ; minutes++) {
                System.out.printf("%d - minutes%n", minutes);
            }
        }

    }
}
