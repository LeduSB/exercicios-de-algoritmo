import java.util.Scanner;

public class E11Circumference {
//Receba o raio de uma circunferência. Calcule e mostre o comprimento da circunferência.
    public static void main(String[] args) {
    double radius;
    double circumference;
    Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o raio de um círculo para calcular o comprimento de sua circunferência.");
        radius = scanner.nextDouble();
        scanner.close();
        circumference = 2 * Math.PI * radius;
        System.out.printf("O comprimento da circunferência desse círculo é %.2f%n",circumference);
    }
}
