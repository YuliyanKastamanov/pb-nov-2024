package ExamPrep;

import java.util.Scanner;

public class EasterEggsBattle_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //прочитаме входните данни
        int countEggsFirstPlayer = Integer.parseInt(scanner.nextLine());
        int countEggsSecondPlayer = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();// End or "one" or "two"

        //докато не получим команда "End" или докато един от играчите не остане с 0 яйца
        while (!command.equals("End")){

            //ако получим команда "one" -> намаляваме яйцата на втория играч
            //ако получим команда "two" -> намаляваме яйцата на първия играч
            switch (command){
                case "one" -> countEggsSecondPlayer--;
                case "two" -> countEggsFirstPlayer--;
            }

            //проверяваме дали някой от играчите е останал без яйца
            if(countEggsFirstPlayer == 0){
                System.out.printf("Player one is out of eggs. Player two has %d eggs left.", countEggsSecondPlayer);
                break;
            }else if(countEggsSecondPlayer == 0){
                System.out.printf("Player two is out of eggs. Player one has %d eggs left.", countEggsFirstPlayer);
                break;
            }

            //позволяваме на потребителя да въведе или команда "End" или победител от битката -> "one" or "two"
            command = scanner.nextLine();
        }

        //проверяваме дали сме получили команда "End"
        if(command.equals("End")){
            System.out.printf("Player one has %d eggs left.%n", countEggsFirstPlayer);
            System.out.printf("Player two has %d eggs left.", countEggsSecondPlayer);
        }



    }
}
