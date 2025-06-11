import java.util.Scanner;

public class E8SavingsIncome {
//Receba o valor de um depósito em poupança. Calcule e mostre o valor
// após 1 mês de aplicação sabendo que rende 1,3% a. m.
    public static void main(String[] args) {
        double value;
        double interest =1.3;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o valor depositado?");
        value = scanner.nextDouble();
        scanner.close();
        System.out.println("Em um mês de aplicação, com um rendimento de "+interest+" a. m., o valor final será de "+value*interest+".");
    }
}
