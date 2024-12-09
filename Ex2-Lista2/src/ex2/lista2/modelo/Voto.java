/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2.lista2.modelo;

import ex2.lista2.estatisticas.Estatisticas;
import ex2.lista2.repositorio.Entrevistados;
/**
 *
 * @author victorrocha
 */
public class Voto {

    private String intencao;
    

    public String Intencao(int opcao) {
        switch (opcao) {
            case 1:
                intencao = "Fulano da Silva(PSDB)";
                
                break;

            case 2:
                intencao = "Beltrano da Costa(PT)";
                
                break;

            case 3:
                intencao = "Ciclano do Amaral(MDB)";
                
                break;

            case 4:
                intencao = "Nulo";
                
                break;

            case 5:
                intencao = "Branco";
                
                break;

        }
        Estatisticas.ContaVoto(opcao);

        
        
       
        return intencao;
    }
    
    
}
