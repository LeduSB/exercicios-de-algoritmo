import java.util.Scanner;

//Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos).
//Calcule e mostre a velocidade média em km/h.

public class E27AverageSpeed {
    public static void main(String[] args) {
        int lap;
        double circuitExtension;
        int durationMin;
        double durationHour;
        double distanceMeters;
        double distanceKilometers;
        double averageSpeed;
        Scanner scanner = new Scanner (System.in);

        System.out.println("Informe os dados solicitados para calcular a velocidade média alcançada no percurso.");
        System.out.println("Quantas voltas foram dadas?");
        lap = scanner.nextInt();
        System.out.println("Qual a extensão do percurso? (em metros)");
        circuitExtension = scanner.nextDouble();
        System.out.println("Qual o tempo de duração do percurso? (em minutos)");
        durationMin = scanner.nextInt();
        scanner.close();
        distanceMeters = lap * circuitExtension;
        distanceKilometers = distanceMeters/1000;
        durationHour = (double) durationMin/60;
        averageSpeed = distanceKilometers/durationHour;
        System.out.println("A velocidade média atingida nesse percurso é "+averageSpeed+" Km/h.");
    }
}
