import java.util.Scanner;

public class E14TriangleAngle {
// Receba 2 ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo.
    public static void main(String[] args) {
        double angle1, angle2, angle3;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe os valores de 2 ângulos de um triângulo para descobrir o valor do terceiro ângulo.");
        System.out.println("Qual o valor do primeiro ângulo?");
        angle1 = scanner.nextDouble();
        System.out.println("Qual o valor do segundo ângulo?");
        angle2 = scanner.nextDouble();
        scanner.close();
        angle3 = 180 - (angle1+angle2);
        System.out.println("O valor do terceiro ângulo é "+angle3+".");
    }
}
