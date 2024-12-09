/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conta;

import atividade01.Cardapio.Lanche;
import atividade01.Cardapio.Tradicional;
import atividade01.Cardapio.Vegetariano;
import atividade01.Pedido.Pedido;
import atividade01.Repositorio.ListaPedidos;
import atividade01.Cliente.Cliente;
import atividade01.Cardapio.Polpa;
import atividade01.Cardapio.Fruta;

/**
 *
 * @author victorrocha
 */
public class Conta {

    private double conta;

    public double Calcula(Iterable<Cliente> ListaPedidos) {

        for (Cliente p : ListaPedidos) {
            conta = p.getPedido().getLanche().getValorFinal() + p.getPedido().getSuco().getValorFinal();
        }
        return conta;
    }

}
