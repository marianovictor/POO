/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade01.Cardapio;

/**
 *
 * @author victorrocha
 */
public class Suco {
    private double valorBase;
    private int codigo;
    private String nome;
    private String ingredientes;
    private double valorFinal;

    public Suco() {
    }

    public Suco(double valorBase, int codigo, String nome, String ingredientes) {
        this.valorBase = valorBase;
        this.codigo = codigo;
        this.nome = nome;
        this.ingredientes = ingredientes;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(int valorBase) {
        this.valorBase = valorBase;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }
    
    @Override
    public String toString() {
        return "Suco{" + "valorBase=" + valorBase + ", codigo=" + codigo + ", nome=" + nome + ", ingredientes=" + ingredientes + '}';
    }
    
    
}
