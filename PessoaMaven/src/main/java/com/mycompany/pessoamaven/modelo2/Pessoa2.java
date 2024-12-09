/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pessoamaven.modelo2;

/**
 *
 * @author victorrocha
 */
public class Pessoa2 {
    private String nome;
    private int idade;
    private int id;

    public Pessoa2() {
    }

    public Pessoa2(String nome, int idade, int id) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Pessoa2{" + "nome=" + nome + ", idade=" + idade + ", id=" + id + '}';
    }

    
}
