package _07_FoorLoop_LAB;

public class Demo {
    public static void main(String[] args) {


        int number = 10;

        //инкрементиране - инкрементация
        //number = number + 1;
        //пре-инкрементация
        System.out.println(++number);
        //пост-инкрементация
        System.out.println(number++);
        System.out.println(number);

        //Декремнтиране - намалява стойността на променливата с 1
        //пре-декрементация
        System.out.println(--number);
        //пост-декрементация
        System.out.println(number--);
        System.out.println(number);

        //1. създаване на целочислена променлива, от която ще зависят повторенията на нашия цикъл

        for (int count = 1; count <= 10; count++){

            System.out.println(count);
        }
        
        String name = "Yuli";

        for (int i = 0; i < name.length(); i++) {

            char letter = name.charAt(i);
            System.out.println(letter);
        }





    }
}
