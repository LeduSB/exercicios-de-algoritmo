import java.util.Scanner;
public class E12CalculateAge {
//Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e
// quantos anos terá daqui a 17 anos.
    public static void main(String[] args) {
        int birthYear, currentYear, currentAge, futureAge = 17;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o ano de seu nascimento?");
        birthYear = scanner.nextInt();
        System.out.println("Qual o ano atual?");
        currentYear = scanner.nextInt();
        scanner.close();
        currentAge = currentYear - birthYear;
        System.out.println("Então você tem/terá "+currentAge+" anos em "+currentYear+".");
        System.out.println("Em "+(currentYear+futureAge)+" você terá "+(currentAge+futureAge)+" anos.");
    }
}
