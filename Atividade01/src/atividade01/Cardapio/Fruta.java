/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade01.Cardapio;

/**
 *
 * @author victorrocha
 */
public class Fruta extends Suco {
    private int numeroFrutas;

    public Fruta() {
    }
    
    public Fruta(int numeroFrutas, int valorBase, int codigo, String nome, String ingredientes) {
        super(valorBase, codigo, nome, ingredientes);
        this.numeroFrutas = numeroFrutas;
    }

    public int getNumeroFrutas() {
        return numeroFrutas;
    }

    public void setNumeroFrutas(int numeroFrutas) {
        this.numeroFrutas = numeroFrutas;
    }

    @Override
    public String toString() {
        return super.toString()+ ", Fruta{" + "numeroFrutas=" + numeroFrutas + '}';
    }
    
    
}
