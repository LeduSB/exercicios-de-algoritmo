import java.util.Scanner;

public class E10Difference {
//Receba 2 números reais. Calcule e mostre a diferença desses valores.
    public static void main(String[] args){
        double a, b, difference;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe 2 valores para calcular a diferença entre eles.");
        System.out.println("Qual o valor de A?");
        a = scanner.nextDouble();
        System.out.println("Qual o valor de B?");
        b = scanner.nextDouble();
        difference = a-b;
        System.out.println("A diferença de "+a+" e "+b+" é "+difference+".");
    }
}
