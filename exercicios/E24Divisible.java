import java.util.Scanner;

//Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.

public class E24Divisible {
    public static void main(String[] args) {
        int value;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um valor inteiro:");
        value = scanner.nextInt();
        if(value % 2 == 0 && value % 3 == 0){
            System.out.println("Esse número é divisível por 2 e por 3.");
        }
        else if(value % 2 == 0 && value % 3 != 0){
            System.out.println("Esse número é apenas divisível por 2.");
        }
        else if(value % 2 != 0 && value % 3 == 0){
            System.out.println("Esse número é apenas divisível por 3.");
        }
        else{
            System.out.println("Esse número não é divisível por 2 nem por 3.");
        }
    }
}
