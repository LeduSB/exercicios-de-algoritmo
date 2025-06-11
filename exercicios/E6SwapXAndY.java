import java.util.Scanner;
import java.util.HashMap;

public class E6SwapXAndY {
    public static void main(String[] args) {
        //Receba os valores em x e y. Efetua a troca de seus valores e mostre seus
        //conteúdos.
        boolean isSwaped =  false;
        String[] keys = {"X","Y"};
        HashMap<String, Double> values = new HashMap<>();
        values.put(keys[0],0.0);
        values.put(keys[1],0.0);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe dois valores para realizar a troca das variáveis desses valores.");
        for(String key : values.keySet()){

            while(true){
                System.out.println("Informe o valor de "+key+":");
                String input = scanner.nextLine();
                input = input.replace(",",".");
                try{
                    values.put(key,Double.parseDouble(input));
                    break;
                }
                catch(NumberFormatException e){
                    System.out.println("Valor inválido, por favor tente novamente.");
                }
            }
        }
        for(int i=0;i<keys.length;i++){
            System.out.println("Valor de "+keys[i]+" = "+values.get(keys[i]));
            if(i==keys.length-1 && !isSwaped){
                double tempValue = values.get(keys[0]);
                values.put(keys[0],values.get(keys[1]));
                values.put(keys[1],tempValue);
                System.out.println("Valores trocados, segue os novos valores:");
                i=-1;
                isSwaped = true;
            }
        }
    }
}