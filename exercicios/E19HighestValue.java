import java.util.Scanner;

public class E19HighestValue {
    // Receba 2 valores reais. Calcule e mostre o maior deles.
    public static void main(String[] args) {
        double a, b, highestValue;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe dois valores reais para descobrir o maior dentre eles.");
        System.out.println("Informe o valor A:");
        a = scanner.nextDouble();
        System.out.println("Informe o valor B:");
        b = scanner.nextDouble();
        if(a>b){
            highestValue = a;
        }
        else{
            highestValue = b;
        }
        System.out.println(highestValue+" é o maior valor entre "+a+" e "+b+".");
    }
}
