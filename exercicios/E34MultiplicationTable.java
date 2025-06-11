//Receba um número. Calcule e mostre os resultados da tabuada desse número.

import java.util.Scanner;

public class E34MultiplicationTable {
    public static void main(String[] args) {
        double num, product;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número, e calcularemos a sua tabuada.");
        num = scanner.nextDouble();
        scanner.close();
        for (int i = 1; i <= 10; i++) {
            product = num*i;
            System.out.println(num+" x "+i+" = "+product);
        }
    }
}
