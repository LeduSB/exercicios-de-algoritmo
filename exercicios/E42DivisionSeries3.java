//Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99

public class E42DivisionSeries3 {
    public static void main(String[] args) {
        int numerator = 1;
        int denominator;
        double result = 0;

        while (numerator < 50){
            if(numerator == 1){
                System.out.println(numerator);
                result+=numerator;
            }
            numerator++;
            denominator = numerator*2-1;
            result+=(double)numerator/denominator;
            System.out.println("+ "+numerator+"/"+denominator+" = "+result);
        }
    }
}
