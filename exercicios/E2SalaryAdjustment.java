import java.util.Scanner;
import java.text.DecimalFormat;

public class E2SalaryAdjustment {
//Receba o salário de um funcionário e mostre o novo salário com reajuste
// de 15%.

    public static void main(String[] args){
        double adjustmentValue = 0.15;
        double salary;
        boolean isNumeric = false;

        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        while(!isNumeric){
            System.out.println("Insira o valor do salário para saber o valor com o reajuste de "+(int)(adjustmentValue*100)+"%:");
            String input = scanner.nextLine();
            input = input.replace(",",".");

            try{
                salary = Double.parseDouble(input);
                double adjustedSalary = salary + (salary * adjustmentValue);
                System.out.println("O valor do salário inserido com o reajuste é de R$ "+df.format(adjustedSalary)+".");
                isNumeric = true;
            }
            catch(NumberFormatException e){
                System.out.println("O valor inserido é inválido! Tente novamente.");
            }
        }
        scanner.close();
    }
}
