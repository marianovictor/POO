package ex03;
import java.util.Scanner;


public class Dados {
    public static void main(String[] args) {
        int valor, cod, vagas, masc, fem, totalVagas=0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite quantos cursos ira cadastrar: ");
        valor = scanner.nextInt();

        Info[] vetor = new Info[valor];
        for (int i = 0; i<valor;i++){

            float CV, porcMulheres;
            Info course = new Info();

            System.out.println("Digite o codigo do curso: ");
            cod = scanner.nextInt();
            course.setCodigo(cod);

            System.out.println("Digite o numero de vagas do curso: ");
            vagas = scanner.nextInt();
            course.setTotalVagas(vagas);

            System.out.println("Digite o total de vagas para homens: ");
            masc = scanner.nextInt();
            course.setMasculino(masc);

            System.out.println("Digite o total de vagas para mulheres: ");
            fem = scanner.nextInt();
            course.setFeminino(fem);
            
            vetor[i] = course;

            CV = (masc + fem)/vagas;
            porcMulheres = (fem/vagas)*100;
            System.out.printf("Numero de candidos por vaga:%.2f , porcentagem de canditadas:%.2f \n", CV, porcMulheres);
            totalVagas += vagas;

        }
        int maior=0, codMaior=0;
        for (int i = 0; i<valor;i++){
            if(vetor[i].getTotalVagas() > maior){
                maior = vetor[i].getTotalVagas();
                codMaior = vetor[i].getCodigo();
            }
        }
        System.out.printf("O maior numero de vagas e:%d, do curso %d\n", maior, codMaior);
        System.out.printf("Numero total de vagas do concurso e:%d", totalVagas);

    }
    
}
