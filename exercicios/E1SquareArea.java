import java.util.Scanner;

public class E1SquareArea {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Para descobrir o valor da área de um quadrado, digite o valor de um dos lados:");
        double squareSide = scanner.nextInt();
        System.out.println("O valor inserido foi "+squareSide+". A área desse quadrado é "+squareSide*squareSide);
        scanner.close();
    }
}
