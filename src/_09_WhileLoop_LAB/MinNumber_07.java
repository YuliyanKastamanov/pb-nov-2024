package _09_WhileLoop_LAB;

import java.util.Scanner;

public class MinNumber_07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int minNumber = 0;

        boolean isFirstNumber = true;

        while (!command.equals("Stop")){//while (true)
            /*if(command.equals("Stop")){
                break;
            }*/
            int currentNumber = Integer.parseInt(command);//"100" -> 100

            if (isFirstNumber){
                minNumber = currentNumber;
                isFirstNumber = false;
            }

            if(currentNumber < minNumber){
                minNumber = currentNumber;
            }
            command = scanner.nextLine();
        }

        System.out.println(minNumber);
    }
}
