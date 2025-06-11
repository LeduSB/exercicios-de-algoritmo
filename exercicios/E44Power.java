//Receba o número da base e do expoente. Calcule e mostre o valor da potência.

import java.util.Scanner;

public class E44Power {
    public static void main(String[] args) {
        int base;
        int exponent;
        double result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor da base da potência:");
        base = scanner.nextInt();
        System.out.println("Informe o valor do expoente da potência:");
        exponent = scanner.nextInt();
        result = Math.pow(base, exponent);
        System.out.printf("O valor dessa potência é %.1f",result);
    }
}
