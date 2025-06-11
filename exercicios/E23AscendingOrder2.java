import java.util.Arrays;
import java.util.Scanner;

//Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente em
//ordem. Mostre os 4 números em ordem crescente.

public class E23AscendingOrder2 {
    public static void main(String[] args) {
        double[] values = new double[4];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um valor:");
        values[0] = scanner.nextDouble();
        for (int i=1;i<3;i++){
            System.out.println("Informe um novo valor MAIOR que o anterior:");
            values[i] = scanner.nextDouble();
            if (values[i] <= values[i-1]){
                System.out.println("O valor inserido é menor ou igual ao anterior.");
                System.exit(0);
            }
        }
        System.out.println("Informe um novo valor qualquer:");
        values[3] = scanner.nextDouble();
        scanner.close();
        Arrays.sort(values);
        System.out.println("Os números em ordem crescente são: "+Arrays.toString(values));
    }
}
