package ExamPrep;

import java.util.Scanner;

public class MovieDestination_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //прочитаме входните данни
        //1.	Бюджет на филма – реално число в диапазона [100 000.0… 2 000 000.0]
        //2.	Дестинация – текст, с възможности "Dubai", "Sofia" и "London"
        //3.	Сезон – текст, с възможности "Summer" и "Winter"
        //4.	Брой дни  – цяло число в диапазона [1… 40]
        double budget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        int countDays = Integer.parseInt(scanner.nextLine());

                        //Дестинация
        //Сезон	    Dubai	    Sofia	    London
        //Winter	45 000 lv.	17 000 lv.	24 000 lv.
        //Summer	40 000 lv.	12 500 lv.	20 250 lv.

        double finalSum = 0;

        //пресмятаме финалната сума в зависимост от дестинация
        switch (destination) {
            case "Dubai" -> {
                //проверяваме дали филмът ще се снима зимата или лятото
                //1. Winter -> един снимачен ден е 45000лв
                //2. Summer -> един снимачен ден е 40000лв
                if(season.equals("Winter")){
                    finalSum = countDays * 45000;
                } else if (season.equals("Summer")) {
                    finalSum = countDays * 40000;
                }
                //щом филмът се снима в Дубай имаме допълнителна отстъпка от 30% на крайната сума
                finalSum *= 0.7;
            }

            case "Sofia" -> {
                //проверяваме дали филмът ще се снима зимата или лятото
                //1. Winter -> един снимачен ден е 17000лв
                //2. Summer -> един снимачен ден е 12500лв
                if(season.equals("Winter")){
                    finalSum = countDays * 17000;
                }else if(season.equals("Summer")){
                    finalSum = countDays * 12500;
                }

                //щом филмът се снима в София имаме оскъпяване на крайната сума с 25%
                finalSum *= 1.25;

            }

            case "London" -> {
                //проверяваме дали филмът ще се снима зимата или лятото
                //1. Winter -> един снимачен ден е 24000лв
                //2. Summer -> един снимачен ден е 20250лв
                if(season.equals("Winter")){
                    finalSum = countDays * 24000;
                }else if(season.equals("Summer")){
                    finalSum = countDays * 20250;
                }
            }
        }

        //намираме разликата между бюджета и райната сума
        double diff = Math.abs(budget - finalSum);

        //проверяваме дали бюджетът е достатъчен
        if(budget >= finalSum){
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", diff);
        }else {
            System.out.printf("The director needs %.2f leva more!", diff);
        }



    }
}
