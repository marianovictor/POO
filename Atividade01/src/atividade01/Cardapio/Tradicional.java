/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade01.Cardapio;

/**
 *
 * @author victorrocha
 */
public class Tradicional extends Lanche {

    private String carne;
    

    
    

    public Tradicional() {
    }

    public Tradicional(String carne, int identificador, String nome, String ingredientes, double valorBase) {
        super(identificador, nome, ingredientes, valorBase);
        this.carne = carne;
        super.setValorFinal(valorBase + (valorBase*0.20));
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    @Override
    public String toString() {
        return super.toString()+ ", Tradicional{" + "carne=" + carne + '}';
    }


    
   

}
