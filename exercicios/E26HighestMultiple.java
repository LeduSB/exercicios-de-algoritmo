import java.util.Scanner;

//Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor.

public class E26HighestMultiple {
    public static void main(String[] args) {
        int a,b;
        double remainder;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe 2 valores para descobrir se o maior é múltiplo do menor.");
        a = scanner.nextInt();
        b = scanner.nextInt();
        scanner.close();
        if(a > b){
            remainder = a % b;
            if (remainder == 0){
                System.out.println(a+" é divisível por "+b);
            }
            else{
                System.out.println(a+" não é divisível por "+b);
            }
        }
        else {
            remainder = b % a;
            if (remainder == 0){
                System.out.println(b+" é divisível por "+a);
            }
            else{
                System.out.println(b+" não é divisível por "+a);
            }
        }
    }
}
