import java.util.Scanner;
import java.util.Arrays;

//Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.

public class E22AscendingOrder {
    public static void main(String[] args) {
        int[] values = new int[2];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um valor inteiro:");
        values[0] = scanner.nextInt();
        System.out.println("Informe um novo valor inteiro DIFERENTE do anterior:");
        values[1] = scanner.nextInt();
        if (values[0] == values[1]){
            System.out.println("Os dois valores são iguais.");
            System.exit(0);
        }
        else {
            Arrays.sort(values);
            System.out.println("Os números em ordem crescente são: "+Arrays.toString(values));
        }
    }
}
