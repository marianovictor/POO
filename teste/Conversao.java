import java.util.Scanner;
public class Conversao {
    public  static void main(String[] args){
        int num = 39;
        String bin = "";
        String binInvertido= "";
        
        //System.out.println("Digite um numero:");
        //Scanner scanner = new Scanner(System.in);
        //num = scanner.nextInt();

        while(num >0 ){
            bin += "" + num%2;
            num = num/2;
        }

        
        for (int i = (bin.length()); i!=0; i--){
            binInvertido += bin.charAt(i-1);
        }
        System.out.println("BINARIO: "+binInvertido);
        
        int length = bin.length();
        int expoente = bin.length() - 1;
        int decimal[] = new int[length];
        int aux;
        int resultado=1;

        for(int j=expoente; j==0; j--){
            aux=1;
            for(int x = 1; x<= j; x++){
                aux += aux*decimal[j];
            }
            resultado += aux; 
        }
        System.out.println(resultado);
        
    }
}