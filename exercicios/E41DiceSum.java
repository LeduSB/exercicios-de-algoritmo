//Mostre todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7.

public class E41DiceSum {
    public static void main(String[] args) {
        int dice1 = 6;
        int dice2 = 6;

        for (int i = 1; i <= dice1; i++){
            for (int j = 1; j <= dice2; j++){
                if (i+j==7){
                    System.out.println("Dado A = "+i+" + Dado B = "+j+" -> Total = "+(i+j));
                }
            }
        }
    }
}
