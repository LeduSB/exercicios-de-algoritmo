//Receba 100 números inteiros reais. Verifique e mostre o maior e o menor valor. Obs.: somente valores positivos.

import java.util.Arrays;
import java.util.Random;

public class E38HighestAndLowestValues {
    public static void main(String[] args) {
        int maxValue = 100;
        int[] values = new int[maxValue];
        Random random = new Random();

        for (int i = 0; i < values.length; i++) {
            values[i] = random.nextInt(1,10000);
            System.out.println(values[i]);
        }
        Arrays.sort(values);
        System.out.println("O menor valor é: "+values[0]);
        System.out.println("O maior valor é: "+values[maxValue-1]);
    }
}
