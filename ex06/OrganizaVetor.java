
import java.util.Scanner;

public class OrganizaVetor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        int NewPosicao = 0;
        for(int i=0; i<10; i++){
            System.out.println("Posicao " + i);
            vetor[i] = scanner.nextInt();
        }
        for(int a =0; a<10; a++){
            System.out.println("PRIMEIRO VETOR "+vetor[a]);
        }

        for(int j=0; j<10; j++){
            if((vetor[j] == 0) || (vetor[j] > 0)){
                NewPosicao++;
            }
        }

        int [] newVetor = new int[NewPosicao];
        for(int x =0; x<NewPosicao; x++){
            for(int j=0; j<10; j++){
                if((vetor[j] == 0) || (vetor[j] > 0)){
                    newVetor[x] = vetor[j];
                }
            }
            System.out.println(newVetor[x]);
        }
        
    }
}