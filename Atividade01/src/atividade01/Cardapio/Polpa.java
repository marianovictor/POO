/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade01.Cardapio;

/**
 *
 * @author victorrocha
 */
public class Polpa extends Suco {
    private double gramas; 
    private String fornecedor;
    
    public Polpa() {
    }

    public Polpa(double gramas, String fornecedor, int valorBase, int codigo, String nome, String ingredientes) {
        super(valorBase, codigo, nome, ingredientes);
        this.gramas = gramas;
        this.fornecedor = fornecedor;
        super.setValorFinal(valorBase);
    }

    

    public double getGramas() {
        return gramas;
    }

    public void setGramas(double gramas) {
        this.gramas = gramas;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public String toString() {
        return super.toString()+ ", Polpa{" + "gramas=" + gramas + ", fornecedor=" + fornecedor + '}';
    }

    
    
}
