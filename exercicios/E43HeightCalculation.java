//Calcule e mostre quantos anos serão necessários para que Ana seja maior que Maria sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m e cresce 2 cm ao ano.

public class E43HeightCalculation {
    public static void main(String[] args) {
        double anaHeight = 1.10;
        double anaGrowthRate = 0.03;
        double mariaHeight = 1.5;
        double mariaGrowthRate = 0.02;
        int year = 0;

        while(anaHeight <= mariaHeight){
            System.out.printf("Ana : %.2f | Maria: %.2f\n",anaHeight,mariaHeight);
            anaHeight+=anaGrowthRate;
            mariaHeight+=mariaGrowthRate;
            year++;
        }
        System.out.printf("Ana levará %d ano(s) para ficar mais alta que Maria, quando ela terá %.2f m de altura e Maria %.2f m.\n",year,anaHeight, mariaHeight);
    }
}
