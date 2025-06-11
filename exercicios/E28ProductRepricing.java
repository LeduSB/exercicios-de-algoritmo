import java.util.Scanner;

//Receba o preço atual e a média mensal de um produto. Calcule e mostre o novo preço sabendo que:
// Venda Mensal         Preço Atual         Preço Novo
// < 500                < 30                + 10%
// >= 500 e < 1000      >= 30 e <80         + 15%
// >= 1000              >= 80               - 5%
// Obs.: para outras condições, preço novo será igual ao preço atual.

public class E28ProductRepricing {
    public static void main(String[] args) {
        double currentPrice, newPrice, monthlySales;
        Scanner scanner = new Scanner(System.in);
        newPrice = 0;
        System.out.println("Informe o preço atual do produto e a média de vendas mensal para descobrir se haverá reajuste no preço.");
        System.out.println("Qual o preço do produto?");
        currentPrice = scanner.nextDouble();
        System.out.println("Qual o valor da média de vendas mensal desse produto?");
        monthlySales = scanner.nextDouble();
        scanner.close();
        if (monthlySales<500 && currentPrice<30){
            newPrice = currentPrice+currentPrice*0.1;
        }
        else if(monthlySales>=500&&monthlySales<1000&&currentPrice>=30&&currentPrice<80){
            newPrice = currentPrice+currentPrice*0.15;
        } else if (monthlySales>=1000&&currentPrice>=80) {
            newPrice = currentPrice-currentPrice*0.05;
        }
        else{
            System.out.println("O preço desse produto não sofrerá alterações.");
            System.exit(0);
        }
        System.out.println("O preço desse produto foi reajustado para R$ "+newPrice+".");
    }
}
