import java.util.Scanner;

public class E3TriangleArea {
    public static void main(String[] args){
        double triangleBase;
        double triangleHeight;
        double triangleArea;

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Insira os valores da base e altura de um triângulo, para obter sua área.");
            System.out.println("Insira o valor da base do triângulo:");
            String input = scanner.nextLine();
            input = input.replace(",",".");

            try{
                triangleBase = Double.parseDouble(input);
                while(true) {
                    System.out.println("Insira o valor da altura do triângulo:");
                    input = scanner.nextLine();
                    input = input.replace(",", ".");

                    try{
                        triangleHeight = Double.parseDouble(input);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("O valor inserido é inválido! Tente novamente.");
                    }
                }
                break;
            }
            catch(NumberFormatException e){
                System.out.println("O valor inserido é inválido! Tente novamente.");
            }
        }
        triangleArea = (triangleBase*triangleHeight)/2;
        System.out.println("A área de um triângulo cuja base é "+triangleBase+" e a altura "+triangleHeight+" é "+triangleArea+".");
        scanner.close();
    }
}
