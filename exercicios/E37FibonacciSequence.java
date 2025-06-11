//Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu N’nésimo termo.

import java.util.Scanner;

public class E37FibonacciSequence {
    public static void main(String[] args) {
        int number, lastValue = 1, penultimateValue = 0, sum;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número inteiro para calcular a sequência de Fibonacci até o termo do valor informado.");
        number = scanner.nextInt();
        scanner.close();
        for (int i = 0; i <= number; i++) {
            if(i <= 1){
                System.out.println("Termo "+i+": "+i);
            }
            else{
                sum = penultimateValue+lastValue;
                System.out.println("Termo "+i+": "+sum);
                penultimateValue = lastValue;
                lastValue = sum;
            }
        }
    }
}
