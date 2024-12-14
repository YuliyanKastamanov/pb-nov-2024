package ExamPrep;

import java.util.Scanner;

public class FoodForPets_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //прочитаме входните данни
        int countDays = Integer.parseInt(scanner.nextLine());
        double initialAmountOfFood = Double.parseDouble(scanner.nextLine());

        //създаваме променлива, в които ще пазим общото количество изядена храна;
        int totalEatenFood = 0;
        //създаваме отделни променливи за храната, която изяжда кучето и котката
        int eatenFoodByDog = 0;
        int eatenFoodByCat = 0;
        //създаваме променлива, в която ще пазим изядените бисквитки
        double biscuits = 0;

        //създаваме фор цикъл за дните, в които ще храним кучето и котката
        for (int day = 1; day <= countDays ; day++) {
            //прочитаме колко храна ще получават кучето и котката за 1 ден
            int eatenFoodByDogPerDay = Integer.parseInt(scanner.nextLine());
            int eatenFoodByCatPerDay = Integer.parseInt(scanner.nextLine());

            //добавяме изядена храна за деня към общото количество и към изядената от кучето и котката
            totalEatenFood += (eatenFoodByCatPerDay + eatenFoodByDogPerDay);
            eatenFoodByDog += eatenFoodByDogPerDay;
            eatenFoodByCat += eatenFoodByCatPerDay;

            //пресмятаме количеството на бисквитките
            //На всеки трети ден получават награда - бисквитки
            if(day % 3 == 0){
                biscuits += (eatenFoodByCatPerDay + eatenFoodByDogPerDay) * 0.1;
            }

        }

        //намираме процента на общо изядената храна
        double percentEatenFood = totalEatenFood * 100 / initialAmountOfFood;

        //намираме процента изядена храна от кучето
        double percentEatenFoodByDog = eatenFoodByDog * 100.0 / totalEatenFood;

        //намираме процента изядена храна от котката
        double percentEatenFoodByCat = eatenFoodByCat * 100.0 / totalEatenFood;

        //принтираме
        //•	"Total eaten biscuits: {количество изядени бисквитки}gr."
        //•	"{процент изядена храна}% of the food has been eaten."
        //•	"{процент изядена храна от кучето}% eaten from the dog."
        //•	"{процент изядена храна от котката}% eaten from the cat."
        //Количеството изядени бисквитки трябва да бъде закръглено до най – близкото цяло число,
        // а процентът храна трябва да бъде форматиран до втората цифра след десетичния знак.
        System.out.printf("Total eaten biscuits: %dgr.%n", Math.round(biscuits));
        System.out.printf("%.2f%% of the food has been eaten.%n", percentEatenFood);
        System.out.printf("%.2f%% eaten from the dog.%n", percentEatenFoodByDog);
        System.out.printf("%.2f%% eaten from the cat.", percentEatenFoodByCat);
    }
}
