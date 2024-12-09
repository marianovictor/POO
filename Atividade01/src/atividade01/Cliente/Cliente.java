/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade01.Cliente;

import atividade01.Pedido.Pedido;

/**
 *
 * @author victorrocha
 */
public class Cliente {

    private String nome;
    private long cpf;
    Pedido pedido;
    private double conta;

    public Cliente() {
    }

    public Cliente(String nome, long cpf, Pedido pedido) {
        this.nome = nome;
        this.cpf = cpf;
        this.pedido = pedido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public double getConta() {
        return conta;
    }

    public void setConta(double conta) {
        this.conta = conta;
    }

    public void Calcula() {

        conta = pedido.getLanche().getValorFinal() + pedido.getSuco().getValorFinal();
        setConta(conta);
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", cpf=" + cpf + ", pedido=" + pedido + ", conta=" + conta + '}';
    }

}
