package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class InvalidNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        //ако е в диапазона [100…200] или е 0
        boolean isValidNumber = number >= 100 && number <= 200 || number == 0;

        //и печата "invalid" ако въведеното число не е валидно

        if(!isValidNumber){
            System.out.println("invalid");
        }

    }
}
