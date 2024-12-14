package ExamPrep;

import java.util.Scanner;

public class FruitMarket_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //прочитаме входните данни
        //цената на ягодите за килограм
        double strawberriesPricePerKilo = Double.parseDouble(scanner.nextLine());
        //количество банани
        double bananaQuantity = Double.parseDouble(scanner.nextLine());
        //количество портокали
        double orangeQuantity = Double.parseDouble(scanner.nextLine());
        //количество малини
        double raspberriesQuantity = Double.parseDouble(scanner.nextLine());
        //количество ягоди
        double strawberriesQuantity = Double.parseDouble(scanner.nextLine());

        //пресмятаме колко ще платим за ягодите
        //1.
        double strawberriesFinalPrice = strawberriesQuantity * strawberriesPricePerKilo;

        //•	цената на малините е на половина по-ниска от тази на ягодите;
        //•	цената на портокалите е с 40% по-ниска от цената на малините;
        //•	цената на бананите е с 80% по-ниска от цената на малините.

        //2.
        //пресмятаме колко е цената на малините за кг
        double raspberriesPricePerKilo = strawberriesPricePerKilo / 2;
        //пресмятаме колко ще платим за малините
        double raspberriesFinalPrice = raspberriesPricePerKilo * raspberriesQuantity;


        //3.
        //пресмятаме колко е цената на портокалите за кг
        double orangePricePerKilo = raspberriesPricePerKilo * 0.6; // raspberriesPricePerKilo - raspberriesPricePerKilo * 0.4
        //пресмятаме колко ще плати за портокалите
        double orangeFinalPrice = orangePricePerKilo * orangeQuantity;

        //4.
        //пресмятаме колко е цената на бананите за кг
        double bananaPricePerKilo = raspberriesPricePerKilo * 0.2; //raspberriesPricePerKilo - raspberriesPricePerKilo * 0.8
        //пресмятаме колко ще платим за бананите
        double bananaFinalPrice = bananaPricePerKilo * bananaQuantity;


        //пресмятаме общата сума на покупките
        double totalSum = strawberriesFinalPrice + raspberriesFinalPrice + orangeFinalPrice + bananaFinalPrice;

        System.out.printf("%.2f", totalSum);








    }
}
