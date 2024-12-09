/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2.lista2.estatisticas;

import ex2.lista2.repositorio.Entrevistados;
import ex2.lista2.modelo.Eleitor;
import static ex2.lista2.repositorio.Entrevistados.listaEntrevistados;
import java.util.List;

/**
 *
 * @author victorrocha
 */
public class Estatisticas {

    private static int cand1 = 0;
    private static int cand2 = 0;
    private static int cand3 = 0;
    private static int cand4 = 0;
    private static int cand5 = 0;
    
     private static int candEspecial1 = 0;
    private static int candEspecial2 = 0;
    private static int candEspecial3 = 0;
    private static int candEspecial4 = 0;
    private static int candEspecial5 = 0;


    public static void ContaVoto(int opcao) {
        switch (opcao) {
            case 1:
                cand1++;
                break;

            case 2:

                cand2++;
                break;

            case 3:

                cand3++;
                break;

            case 4:

                cand4++;
                break;

            case 5:

                cand5++;
                break;

        }

    }

    public static void ImprimeVoto() {
        System.out.println("Numero de votos para Fulano da Silva(PSDB): " + cand1);
        System.out.println("Numero de votos para Beltrano da Costa(PT): " + cand2);
        System.out.println("Numero de votos para Ciclano do Amaral(MDB): " + cand3);
        System.out.println("Numero de votos Nulo: " + cand4);
        System.out.println("Numero de votos Branco: " + cand5);
    }
    
    public static void IntencaoVotosEspecial(List<Eleitor> lista) {
        
        for (Eleitor cadastro : lista) {
            if (cadastro.getEstadoCivil().equals("Casado")) {
                if (cadastro.getNumeroFilhos() > 0) {
                    if (cadastro.getRendaBruta() < 1500) {
                        if (cadastro.getVoto().equals("Fulano da Silva(PSDB)")) {
                            candEspecial1++;
                        } else if (cadastro.getVoto().equals("Beltrano da Costa(PT)")) {
                            candEspecial2++;
                        } else if (cadastro.getVoto().equals("Ciclano do Amaral(MDB)")) {
                            candEspecial3++;
                        } else if (cadastro.getVoto().equals("Nulo")) {
                            candEspecial4++;
                        } else if (cadastro.getVoto().equals("Branco")) {
                            candEspecial5++;
                        }
                    }
                }
            }
        }

    }

    public static void ImprimeVotoEspecial() {
        System.out.println("\n\n-----------Intenção de votos para cada candidato referente aos entrevistados casados, com\n"
                + "filhos e renda mensal inferior a R$ 1.500,00.-------------");
        System.out.println("Numero de votos para Fulano da Silva(PSDB): " + candEspecial1);
        System.out.println("Numero de votos para Beltrano da Costa(PT): " + candEspecial2);
        System.out.println("Numero de votos para Ciclano do Amaral(MDB): " + candEspecial3);
        System.out.println("Numero de votos Nulo: " + candEspecial4);
        System.out.println("Numero de votos Branco: " + candEspecial5);
    }

}
