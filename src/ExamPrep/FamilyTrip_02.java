package ExamPrep;

import java.util.Scanner;

public class FamilyTrip_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //прочитаме входните данни
        double budget = Double.parseDouble(scanner.nextLine());
        int countNights = Integer.parseInt(scanner.nextLine());
        double pricePerNight = Double.parseDouble(scanner.nextLine());
        int percentExpenses = Integer.parseInt(scanner.nextLine());

        //ако имаме повече от 7 нощувки цената намалява с 5%
        if(countNights > 7){
            pricePerNight = pricePerNight * 0.95;
        }

        //пресметнем колко ще ни струват нощувките
        double priceForAllNights = countNights * pricePerNight;

        //пресмятаме цената за допълнителните разходи
        double priceExpenses = budget * percentExpenses / 100;

        //пресмятаме общата сума
        double totalPrice = priceForAllNights + priceExpenses;

        //разликата между бюджета и общата сума ->
        // 1. ако бюджета е достатъчен това ще е остатъка;
        // 2. ако бюджета не е достатъчен това ще са парите, които не ни достигат;
        double diff = Math.abs(budget - totalPrice);

        //ако бюджета е достатъчен отиваме на екскурзия
        if(budget >= totalPrice){
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", diff);
        }else {
            System.out.printf("%.2f leva needed.", diff);
        }


    }
}
