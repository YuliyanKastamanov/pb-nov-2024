package _05_ConditionalStatementsAdvanced_LAB;

import java.util.Scanner;

public class SmallShop_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //прочитаме входните данни
        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double count = Double.parseDouble(scanner.nextLine());



/*град / продукт	coffee	water	beer	sweets	peanuts
Sofia	            0.50	0.80	1.20	1.45	1.60
Plovdiv	            0.40	0.70	1.15	1.30	1.50
Varna	            0.45	0.70	1.10	1.35	1.55
*/

        double totalPrice = 0;
        switch (product){
            case "coffee" -> {
                switch (town){
                    case "Sofia" -> totalPrice = count * 0.50;
                    case "Plovdiv" -> totalPrice = count * 0.40;
                    case "Varna" -> totalPrice = count * 0.45;
                }
            }
            case "water" -> {
                switch (town){
                    case "Sofia" -> totalPrice = count * 0.80;
                    case "Plovdiv", "Varna" -> totalPrice = count * 0.70;
                }

            }
            case "beer" -> {
                switch (town){
                    case "Sofia" -> totalPrice = count * 1.20;
                    case "Plovdiv" -> totalPrice = count * 1.15;
                    case "Varna" -> totalPrice = count * 1.10;
                }

            }

            case "sweets" -> {
                switch (town){
                    case "Sofia" -> totalPrice = count * 1.45;
                    case "Plovdiv" -> totalPrice = count * 1.30;
                    case "Varna" -> totalPrice = count * 1.35;
                }

            }

            case "peanuts" -> {
                switch (town){
                    case "Sofia" -> totalPrice = count * 1.60;
                    case "Plovdiv" -> totalPrice =  count * 1.50;
                    case "Varna" -> totalPrice = count * 1.55;
                }

            }
        }

        System.out.println(totalPrice);





    }
}
