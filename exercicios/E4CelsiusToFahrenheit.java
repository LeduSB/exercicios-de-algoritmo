import java.util.Scanner;

public class E4CelsiusToFahrenheit {
    //Receba a temperatura em graus Celsius. Calcule e mostre a sua
    // temperatura convertida em fahrenheit F = (9*C+160) /5.

    public static void main(String[] args){
        double degreeCelsius;
        double degreeFahrenheit;

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Informe um valor em graus Celsius para convertê-lo para Fahrenheit:");
            String input = scanner.nextLine();
            input = input.replace(",",".");
            try{
                degreeCelsius = Double.parseDouble(input);
                break;
            }
            catch(NumberFormatException e){
                System.out.println("Valor inserido inválido. Por favor, tente novamente.");
            }
        }
        degreeFahrenheit = (9*degreeCelsius+160)/5;
        System.out.println(degreeCelsius+"°C equivale a "+degreeFahrenheit+"°F.");
        scanner.close();
    }
}
