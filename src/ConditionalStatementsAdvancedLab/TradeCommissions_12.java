package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class TradeCommissions_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String town = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());

        /*
Град	0 ≤ s ≤ 500	     500 < s ≤ 1 000	1 000 < s ≤ 10 000   	s > 10 000
Sofia	      5%	            7%	                8%	                12%
Varna	    4.5%	            7.5%	            10%	                13%
Plovdiv	    5.5%	            8%	                12%	                14.5%

*/

        //При невалиден град или обем на продажбите (отрицателно число) да се отпечата "error".

        boolean isValid = true;
        double commission = 0;
        if(amount >= 0 && amount <= 500){
            switch (town){
                case "Sofia" -> commission = amount * 0.05;
                case "Varna" -> commission = amount * 0.045;
                case "Plovdiv" -> commission = amount * 0.055;
                default -> isValid = false;
            }

        }else if(amount > 500 && amount <= 1000){
            switch (town){
                case "Sofia" -> commission = amount * 0.07;
                case "Varna" -> commission = amount * 0.075;
                case "Plovdiv" -> commission = amount * 0.08;
                default -> isValid = false;

            }
        }else if(amount > 1000 && amount <= 10000){
            switch (town) {
                case "Sofia" -> commission = amount * 0.08;
                case "Varna" -> commission = amount * 0.10;
                case "Plovdiv" -> commission = amount * 0.12;
                default -> isValid = false;
            }
        }else if(amount > 10000){
            switch (town) {
                case "Sofia" -> commission = amount * 0.12;
                case "Varna" -> commission = amount * 0.13;
                case "Plovdiv" -> commission = amount * 0.145;
                default -> isValid = false;
            }
        }else {
           isValid = false;
        }

        if(isValid){
            System.out.printf("%.2f", commission);
        }else {
            System.out.println("error");
        }
    }
}
