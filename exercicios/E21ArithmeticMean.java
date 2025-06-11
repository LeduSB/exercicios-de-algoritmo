import java.util.Scanner;

//E21.Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética.
// Mostre a mensagem de acordo com a média:
// a. Se amédia for >= 6,0 exibir “APROVADO”;
// b. Se amédia for >= 3,0 ou < 6,0 exibir “EXAME”;
// c. Se amédia for < 3,0 exibir “RETIDO”.

public class E21ArithmeticMean {
    public static void main(String[] args) {
        double gradeB1, gradeB2, gradeB3, gradeB4,gradeAverage;
        String studentSituation;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a nota do 1° bimestre:");
        gradeB1 = scanner.nextDouble();
        System.out.println("Informe a nota do 2° bimestre:");
        gradeB2 = scanner.nextDouble();
        System.out.println("Informe a nota do 3° bimestre:");
        gradeB3 = scanner.nextDouble();
        System.out.println("Informe a nota do 4° bimestre:");
        gradeB4 = scanner.nextDouble();
        gradeAverage = (gradeB1+gradeB2+gradeB3+gradeB4)/4;
        System.out.println("A média de notas desse aluno(a) é: "+gradeAverage);

        if(gradeAverage >= 6){
            studentSituation = "APROVADO";
        }
        else if(gradeAverage < 3){
            studentSituation = "RETIDO";
        }
        else{
            studentSituation = "EXAME";
        }
        System.out.println("A situação escolar desse aluno é: "+studentSituation);
        scanner.close();
    }
}
