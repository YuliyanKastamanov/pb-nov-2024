package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class PersonalTitles_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //прочитаме входните данни
        double age = Double.parseDouble(scanner.nextLine());
        char gender = scanner.nextLine().charAt(0);

       /* if(age < 16){

        }else{

        }*/

        //проверяваме пола прочетен от конзолат
        if (gender == 'm'){
            /*•	"Mr." - мъж (пол "m") на 16 или повече години
              •	"Master" - момче (пол "m") под 16 години*/
            if(age >= 16){
                System.out.println("Mr.");
            }else {
                System.out.println("Master");
            }

        }else if(gender == 'f'){
           /* •	"Ms." - жена (пол "f") на 16 или повече години
              •	"Miss" - момиче (пол "f") под 16 години */
            if(age >= 16){
                System.out.println("Ms.");
            }else {
                System.out.println("Miss");
            }

        }
    }
}
