import java.util.Scanner;

public class E16SalaryPayment {
//Receba a quantidade de horas trabalhadas, o valor por hora, o percentual
// de desconto e o número de descendentes. Calcule o salário que serão as
// horas trabalhadas x o valor por hora. Calcule o salário líquido (= Salário
// Bruto– desconto). A cada dependente será acrescido R$ 100 no Salário
// Líquido. Exiba o salário a receber.
    public static void main(String[] args) {
        double hoursWorked;
        double hourlyRate;
        double discount;
        double grossPay;
        double netPay;
        int descendants;
        int valuePerDescendants = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a quantidade de horas trabalhadas:");
        hoursWorked = scanner.nextDouble();
        System.out.println("Qual o valor por hora?");
        hourlyRate = scanner.nextDouble();
        System.out.println("Qual o valor do percentual de desconto sobre o salário?");
        discount = scanner.nextDouble();
        System.out.println("Quantos descendentes você possui?");
        descendants = scanner.nextInt();
        scanner.close();
        grossPay = hoursWorked*hourlyRate;
        netPay = (grossPay-(grossPay*discount))+(descendants*valuePerDescendants);
        System.out.println("Considerando todos os dados informados, seu salário líquido será de R$ "+netPay+".");
    }
}
