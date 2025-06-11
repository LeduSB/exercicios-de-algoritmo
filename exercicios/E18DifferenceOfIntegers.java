import java.util.Scanner;

public class E18DifferenceOfIntegers {
// Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menor valor.
    public static void main(String[] args) {
        int a,b,difference;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe dois valores INTEIROS para calcular a diferença do maior pelo menor.");
        System.out.println("Informe o valor A:");
        a = scanner.nextInt();
        System.out.println("Informe o valor B:");
        b = scanner.nextInt();
        if(a>=b){
            difference = a - b;
        }
        else{
            difference = b-a;
        }
        System.out.println("A diferença entre o valor maior e o menor é "+difference+".");
        scanner.close();
    }
}
