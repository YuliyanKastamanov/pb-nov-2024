package _11_NestedLoops_LAB;

public class MultiplicationTable_02 {
    public static void main(String[] args) {

        for (int firstMultiplier = 1; firstMultiplier <= 10; firstMultiplier++) {

            for (int secondMultiplier = 1; secondMultiplier <= 10 ; secondMultiplier++) {

                int result = firstMultiplier * secondMultiplier;
                System.out.printf("%d * %d = %d%n", firstMultiplier, secondMultiplier, result);

            }

        }
        
        
    }
}
