import java.util.Scanner;

public class E15Hypotenuse {
//Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre a hipotenusa.
    public static void main(String[] args) {
        double sideA, sideB, hypotenuse;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe os valores dos catetos de um triângulo retângulo para calcular a hipotenusa.");
        System.out.println("Qual o valor do primeiro cateto?");
        sideA = scanner.nextDouble();
        System.out.println("Qual o valor do segundo cateto?");
        sideB = scanner.nextDouble();
        scanner.close();
        hypotenuse = Math.sqrt(Math.pow(sideA,2)+Math.pow(sideB,2));
        System.out.println("O valor da hipotenusa considerando esses catetos é "+hypotenuse+"!");
    }
}
