/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2.lista2.modelo;
/**
 *
 * @author victorrocha
 */
public class EstadoCivil {
    private String estado;
    

    public String Intencao(int opcao) {
        switch (opcao) {
            case 1:
                estado = "Casado";
                
                break;

            case 2:
                estado = "Solteiro";
                
                break;

            case 3:
                estado = "Outro";
                
                break;

            

        }
        
       
        return estado;
    }
    
}
