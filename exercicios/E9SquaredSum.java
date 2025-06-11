import java.util.Scanner;

public class E9SquaredSum {
//Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados.
    public static void main(String[] args) {
        int a;
        int b;
        int result;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe 2 números inteiros para realizar a soma desses valores ao quadrado.");
        System.out.println("Informe o valor a:");
        a = scanner.nextInt();
        System.out.println("Informe o valor b:");
        b = scanner.nextInt();
        scanner.close();
        result = (a*a)+(b*b);
        System.out.println("A soma do quadrado de "+a+" e "+b+" é:"+result);
    }
}
