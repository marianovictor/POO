/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade01.Cardapio;

/**
 *
 * @author victorrocha
 */
public class Lanche {
    private int identificador;
    private String nome;
    private String ingredientes;
    private double valorBase;
    private double valorFinal;

    public Lanche() {
    }

    public Lanche(int identificador, String nome, String ingredientes, double valorBase) {
        this.identificador = identificador;
        this.nome = nome;
        this.ingredientes = ingredientes;
        this.valorBase = valorBase;
    }

    

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }

    @Override
    public String toString() {
        return "Lanche{" + "identificador=" + identificador + ", nome=" + nome + ", ingredientes=" + ingredientes + ", valorBase=" + valorBase + ", valorFinal=" + valorFinal + '}';
    }
    
    
    

    
    
    
    
}
