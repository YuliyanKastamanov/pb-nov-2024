package ExamPrep;

import java.util.Scanner;

public class BarcodeGenerator_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //прочитаме 2 цели числа от конзолата
        int firstNumber = Integer.parseInt(scanner.nextLine());//2345
        int secondNumber = Integer.parseInt(scanner.nextLine());//6789

        //намираме първата, втората, третата и четвъртата цифра на 1-вото число
        int firstDigitFirstNum = firstNumber / 1000;//2
        int secondDigitFirstNum = firstNumber / 100 % 10; // 23 -> 23 % 10 -> 3
        int thirdDigitFirstNum = firstNumber / 10 % 10; // 234 -> 234 % 10 -> 4
        int forthDigitFirstNum = firstNumber % 10; //2345 % 10 -> 5

        //намираме първата, втората, третата и четвъртата цифра на 2-вото число
        int firstDigitSecondNum = secondNumber / 1000;//6
        int secondDigitSecondNum = secondNumber / 100 % 10; // 67 -> 67 % 10 -> 7
        int thirdDigitSecondNum = secondNumber / 10 % 10; // 678 -> 678 % 10 -> 8
        int forthDigitSecondNum = secondNumber % 10; //6789 % 10 -> 9

        //преминаваме през всички интервали
        for (int i = firstDigitFirstNum; i <= firstDigitSecondNum; i++) {
            if(i % 2 == 0){
                continue;
            }

            for (int j = secondDigitFirstNum; j <= secondDigitSecondNum ; j++) {
                if(j % 2 == 0){
                    continue;
                }

                for (int k = thirdDigitFirstNum; k <= thirdDigitSecondNum ; k++) {

                    if(k % 2 == 0){
                        continue;
                    }

                    for (int l = forthDigitFirstNum; l <= forthDigitSecondNum ; l++) {

                        if(l % 2 == 0){
                            continue;
                        }
                        System.out.printf("%d%d%d%d ", i, j, k, l);
                        /*if(i % 2 != 0 && j % 2 != 0 && k % 2 != 0 && l % 2 != 0){
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }*/

                    }
                }
            }

        }







    }
}
