package _01_FirstStepsInCoding_LAB;

import java.util.Scanner;

public class ConcatenateData_06 {

    public static void main(String[] args) {




        Scanner scanner = new Scanner(System.in);


        //Прочитаме входните данни от конзолата
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String town = scanner.nextLine();

        System.out.printf("You are %s %s, a %d-years old person from %s.", firstName, lastName, age, town);

        //System.out.println("You are " + firstName + " " + lastName + ", a " + age + "-years old person from " + town + ".");
    }


}
