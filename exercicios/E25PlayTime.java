import java.util.Scanner;

//Receba a hora de início e de final de um jogo (HH,MM), calcular o tempo do jogo em horas e
//minutos, sabendo que o tempo máximo é menor que 24 horas e pode começar num dia e terminar noutro.

public class E25PlayTime {
    public static void main(String[] args) {
        int startHour, startMin, startTotalMin, endHour, endMin, endTotalMin, durationHour, durationTotalMin, durationRemainingMin;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calcularemos o tempo de jogo com base na hora de início e fim do mesmo.");
        System.out.println("Informe a hora de início do jogo e em sequência os minutos.");
        startHour = scanner.nextInt();
        startMin = scanner.nextInt();
        System.out.println("Informe a hora de término do jogo e em sequência os minutos.");
        endHour = scanner.nextInt();
        endMin = scanner.nextInt();

        scanner.close();

        startTotalMin = startHour*60+startMin;
        endTotalMin = endHour*60+endMin;

        if(endTotalMin < startTotalMin){
            endTotalMin += 24*60;
        }

        durationTotalMin = endTotalMin - startTotalMin;
        durationHour = durationTotalMin/60;
        durationRemainingMin = durationTotalMin%60;

        System.out.println("O jogo durou "+durationHour+" hora(s) e "+durationRemainingMin+" minuto(s).");
    }
}
