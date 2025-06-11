import java.util.InputMismatchException;
import java.util.Scanner;

public class E5QuadraticEquation {
//Receba os coeficientes A, B e C de uma equação do 2º grau
// (AX²+BX+C=0). Calcule e mostre as raízes reais (considerar que a
// equação possue2 raízes).
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double delta;
        double x1;
        double x2;

        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Informe os valores correspondentes para realizar uma equação de 2° grau.");
            System.out.println("Informe o valor de A:");
            a = scanner.nextDouble();
            System.out.println("Informe o valor de B:");
            b = scanner.nextDouble();
            System.out.println("Informe o valor de C:");
            c = scanner.nextDouble();

            scanner.close();

            delta = Math.pow(b,2)-(4*a*c);
            x1 = (-b+(Math.sqrt(delta)))/(2*a);
            x2 = (-b-(Math.sqrt(delta)))/(2*a);

            if(delta<0){
                System.out.println("Essa equação não possui raízes reais.");
            }
            else{
                System.out.println("As raízes dessa equação são: " + x1 + " e " + x2 + ".");
            }
        }
        catch(InputMismatchException e){
            System.out.println("Valor inserido inválido.");
            System.exit(1);
        }
    }
}
