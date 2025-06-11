import java.util.Scanner;

public class E17FuelConsumed {
//Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l.
//Receber o tempo de percurso e a velocidade média.

    public static void main(String[] args) {
        double fuelPerKm = 12;
        double travelTime;
        double averageSpeed;
        double distance;
        double fuelConsumed;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos calcular a quantidade de combustível consumida com base nas informações fornecidas.");
        System.out.println("Quanto tempo (em horas) terá o percurso?");
        travelTime = scanner.nextDouble();
        System.out.println("Qual será a velocidade média (em km/h)?");
        averageSpeed = scanner.nextDouble();
        scanner.close();
        distance = travelTime*averageSpeed;
        fuelConsumed = distance/fuelPerKm;
        System.out.println("Você percorrerá uma distância de "+distance+" km e consumirá "+fuelConsumed+" litros de combustível nessa viagem.");
    }
}

