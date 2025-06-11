//Receba 2 números inteiros. Verifique e mostre todos os números primos existentes entre eles.

import java.util.Scanner;

public class E40PrimeNumbers {
    public static boolean isPrime(int number){
        if(number<=1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if(number%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n1, n2, lowest, highest;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe dois números inteiros para ver os números primos entre eles.");
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        if (n1 < n2){
            lowest = n1;
            highest = n2;
        }
        else{
            lowest = n2;
            highest = n1;
        }
        for (int i = lowest; i <= highest; i++) {
            if(E40PrimeNumbers.isPrime(i)){
                System.out.println(i);
            }
        }
    }
}
