//Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde:
//Casa: 1 2 3 4 ... 64
//Qdte: 1 2 4 8 ... N

public class E39ChessboardGrains {
    public static void main(String[] args) {
        int maxSquares = 64;
        double grain, totalGrain = 0;
        for (int i = 0; i < maxSquares; i++) {
            grain = Math.pow(2,i);
            System.out.println("Casa "+(i+1)+": "+grain+" grãos.");
            totalGrain+=grain;
        }
        System.out.println("O total de grãos somando todas as casas é: "+totalGrain);
    }
}
