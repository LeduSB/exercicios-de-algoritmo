//Receba 2 números inteiros, verifique qual o maior entre eles. Calcule e
//mostre o resultado da somatória dos números ímpares entre esses valores.

import java.util.Scanner;

public class E35SumOfOddNumbers {
    public static void main(String[] args) {
        int numA, numB, lowerValue = 0, greaterValue = 0, sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe 2 números inteiros em sequência para calcular a soma dos valores ímpares entre eles.");
        numA = scanner.nextInt();
        numB = scanner.nextInt();
        if(numA == numB){
            System.out.println("Os valores são iguais.");
            System.exit(0);
        }
        else if (numA < numB) {
            lowerValue = numA;
            greaterValue = numB;
        }
        else {
            lowerValue = numB;
            greaterValue = numA;
        }
        for(int i = lowerValue+1;i<greaterValue;i++){
            if (i%2 != 0){
                sum+= i;
            }
        }
        System.out.println("A soma dos números ímpares entre esse valores é "+sum+".");
    }
}
