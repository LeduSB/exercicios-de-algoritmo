import java.util.Scanner;

//Receba um número inteiro. Calcule e mostre o seu fatorial.

public class E32Factorial {
    public static void main(String[] args) {
        int number;
        int factorialResult = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número inteiro para calcular o seu fatorial.");
        number = scanner.nextInt();
        scanner.close();
        if(number<0){
            System.out.println("Não existe fatorial de números negativos.");
            System.exit(0);
        }
        else{
            for(int i=1;i<=number;i++){
                factorialResult *= i;
            }
        }
        System.out.println("O fatorial de "+number+" é "+factorialResult+".");
    }
}
