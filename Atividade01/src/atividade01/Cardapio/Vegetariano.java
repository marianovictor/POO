/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade01.Cardapio;

/**
 *
 * @author victorrocha
 */
public class Vegetariano extends Lanche {
    private String fornecedor;
    public Vegetariano() {
    }

    public Vegetariano(String fornecedor, int identificador, String nome, String ingredientes, double valorBase) {
        super(identificador, nome, ingredientes, valorBase);
        this.fornecedor = fornecedor;
        super.setValorFinal(valorBase + (valorBase*0.40));
    }

    @Override
    public String toString() {
        return super.toString()+ ", Vegetariano{" + "fornecedor=" + fornecedor +super.getValorBase() +'}';
    }

    

    
    
}
