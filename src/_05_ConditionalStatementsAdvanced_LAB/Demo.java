package _05_ConditionalStatementsAdvanced_LAB;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        int hour = Integer.parseInt(scanner.nextLine());

        //новия запис на switch
        switch (day) {
            case "Monday" -> {

                if(hour < 12){
                    System.out.println("go to work");
                }else {
                    System.out.println("you're late");
                }

            }
            case "Tuesday" -> System.out.println("Go to work!");

            // .....
            default -> System.out.println("non working day!");
        }







        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> {
                System.out.println("It's working day!");
                System.out.println("Go to work!");
            }
            default -> System.out.println("Weekend!");
        }

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("It's working day!");
                System.out.println("Go to work!");
                System.out.println("Go to work!");
                System.out.println("Go to work!");
                System.out.println("Go to work!");
                System.out.println("Go to work!");
                System.out.println("Go to work!");
                System.out.println("Go to work!");
                break;
            default:
                System.out.println("Weekend!");
                break;
        }



    }
}
