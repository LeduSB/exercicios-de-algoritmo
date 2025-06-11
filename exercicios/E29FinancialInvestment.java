import java.util.Scanner;

//Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento.
//Calcule e mostre o valor corrigido em 30 dias sabendo que a poupança = 3% e a renda fixa = 5%.
//Demais tipos não serão considerados.

public class E29FinancialInvestment {
    public static void main(String[] args) {
        int investmentType;
        double[] typeInterests = {0.03,0.05};
        double deposit;
        double correctedValue;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o tipo de investimento? 1 - Poupança | 2 - Renda Fixa");
        investmentType =scanner.nextInt();
        if(investmentType<=0||investmentType>2){
            System.out.println("Tipo informado inválido, encerrando operação...");
            System.exit(0);
        }
        System.out.println("Qual será o valor depositado?");
        deposit = scanner.nextDouble();
        correctedValue = deposit+(deposit*typeInterests[investmentType-1]);
        System.out.println("Em 30 dias o valor corrigido será de R$ "+correctedValue+".");
    }
}
