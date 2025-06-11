//Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!

import java.util.Scanner;

public class E36DivisionSeries2 {
    public static double factorial(double n){
        double factorialResult = 1;
        if(n<0){
            System.out.println("Não existe fatorial de números negativos.");
            System.exit(0);
        }
        else{
            for(int i=1;i<=n;i++){
                factorialResult *= i;
            }
        }
        return factorialResult;
    }

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
            double div = 1.0/(E36DivisionSeries2.factorial(i+1));
            sum += div;
            System.out.println((sum-div)+" + "+1+" / "+(i+1)+"! = "+sum);
        }
    }
}
