package _05_ConditionalStatementsAdvanced_LAB;

import java.util.Scanner;

public class WorkingHours_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //прочитаме входните данни
        int hour = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();

        //работното време на офисът е от 10-18
        //понеделник до събота включително
        /*if((hour >= 10 && hour <= 18) &&
                (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday") || day.equals("Saturday"))){
            System.out.println("open");
        }else {
            System.out.println("closed");
        }*/

        boolean isWorkingTime = hour >= 10 && hour <= 18;
        boolean isWorkingDay = day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday") || day.equals("Saturday");

        if(isWorkingTime && isWorkingDay){
            System.out.println("open");
        }else {
            System.out.println("closed");
        }


    }



}
