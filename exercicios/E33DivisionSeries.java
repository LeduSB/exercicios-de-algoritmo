//Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.

import java.util.Scanner;

public class E33DivisionSeries {
    public static void main(String[] args) {
        double number, sum = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número positivo maior que zero:");
        number = scanner.nextDouble();
        scanner.close();
        if (number<0){
            System.out.println("Valor inserido inválido!");
            System.exit(0);
        }
        System.out.println("1");
        for (int i=1;i<number;i++){
            double div = 1.0/(i+1);
            sum += div;
            System.out.println((sum-div)+" + "+1+" / "+(i+1)+" = "+sum);
        }
    }
}
