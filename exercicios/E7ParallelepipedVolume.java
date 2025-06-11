import java.util.Scanner;

public class E7ParallelepipedVolume {
//Receba os valores do comprimento, largura e altura de um paralelepípedo.
// Calcule e mostre seu volume.
    public static void main(String[] args) {
        double length;
        double width;
        double height;
        double volume;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe os valores correspondentes de um paralelepípedo para calcular seu volume.");
        System.out.println("Informe o valor do seu comprimento:");
        length = scanner.nextDouble();
        System.out.println("Informe o valor do sua largura:");
        width = scanner.nextDouble();
        System.out.println("Informe o valor do sua altura:");
        height = scanner.nextDouble();
        scanner.close();
        volume = length*width*height;
        System.out.println("O volume de um paralelepípedo com "+length+" de comprimento, "+width+" de largura, e "+height+" de altura, é: "+volume+".");
    }
}
