import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

//Receba a data de nascimento e atual em ano, mês e dia. Calcule e mostre a idade em anos, meses e dias,
//considerando os anos bissextos.

public class E30CalculateAge2 {
    public static void main(String[] args) {
        int[] birthDateArray = new int[3];
        int[] currentDateArray = new int[3];
        LocalDate birthDate;
        LocalDate currentDate;
        Period period;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o seu ano de nascimento em 3 etapas: Dia, Mês e Ano.");
        for(int i=0;i<birthDateArray.length;i++){
            birthDateArray[i] = scanner.nextInt();
        }
        System.out.println("Informe o ano atual em 3 etapas: Dia, Mês e Ano.");
        for(int i=0;i<currentDateArray.length;i++){
            currentDateArray[i] = scanner.nextInt();
        }
        scanner.close();
        birthDate = LocalDate.of(birthDateArray[2],birthDateArray[1],birthDateArray[0]);
        currentDate = LocalDate.of(currentDateArray[2],currentDateArray[1],currentDateArray[0]);
        period = Period.between(birthDate,currentDate);
        System.out.println("Atualmente você possui "+period.getYears()+" anos, "+period.getMonths()+" meses e "+period.getDays()+" dias.");
    }
}
