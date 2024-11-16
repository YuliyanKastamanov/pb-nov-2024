package _02_FirstStepsInCoding_EXERCISE;

import java.util.Scanner;

public class BasketballEquipment_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int annualFee = Integer.parseInt(scanner.nextLine());

        //•	Баскетболни кецове – цената им е 40% по-малка от таксата за една година
        //•	Баскетболен екип – цената му е 20% по-евтина от тази на кецовете
        //•	Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип
        //•	Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка

        double sneakersPrice = annualFee - (annualFee * 0.40);
        double setPrice = sneakersPrice - (sneakersPrice * 0.20);
        double ballPrice = setPrice * 1/4;
        double accPrice = ballPrice * 1/5;

        System.out.println(annualFee + sneakersPrice + setPrice + ballPrice + accPrice);
    }
}
