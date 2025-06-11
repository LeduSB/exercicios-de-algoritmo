import java.util.Scanner;

public class E13DailyConsumption {
//Receba a quantidade de alimento em quilos. Calcule e mostre quantos dias
// durará esse alimento sabendo que a pessoa consome 50g ao dia.
    public static void main(String[] args) {
        double kilograms;
        double consumptionPerDay = 40;
        int duration;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a quantidade de alimentos em quilos:");
        kilograms = (scanner.nextDouble())*1000;
        scanner.close();
        duration = (int) Math.floor(kilograms/consumptionPerDay);
        System.out.println("Essa quantidade de alimento com um consumo de "+consumptionPerDay+" gramas por dia, duraria "+duration+" dia(s).");
    }
}
