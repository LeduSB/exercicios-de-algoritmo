//Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225

public class E45DivisionSeries4 {
    public static void main(String[] args) {
        int numerator = 1;
        int denominator;
        double result = 1;

        while(numerator<=15){
            if(numerator==1){
                System.out.println(numerator);
                result = (double)numerator;
            }
            numerator++;
            denominator = numerator*numerator;
            result += (double)numerator/denominator;
            System.out.printf("+ %d/%d = %.2f\n",numerator,denominator,result);
        }
    }
}
