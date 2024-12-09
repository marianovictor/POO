/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade01;

/**
 *
 * @author victorrocha
 */

import atividade01.Cardapio.Lanche;
import atividade01.Cardapio.Tradicional;
import atividade01.Cardapio.Vegetariano;
import atividade01.Pedido.Pedido;
import atividade01.Repositorio.ListaPedidos;
import atividade01.Cliente.Cliente;
import atividade01.Cardapio.Polpa;
import atividade01.Cardapio.Fruta;
import Conta.Conta;

public class Atividade01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tradicional trad = new Tradicional("Bovino", 1, "Lanchao top", "cebola, alface, tomate, carne e queijo", 20.00);
        Vegetariano veg = new Vegetariano("Friboi", 2, "Lanche tchola", "Alface, tomate, quiejo, soja", 16.00);
        Polpa polp1 = new Polpa(25, "Piracanjuba", 5, 32, "Suco de uva", "Polpa de uva com agua");
        
        Pedido ped2 = new Pedido(trad, polp1);
        Pedido ped1 = new Pedido();
        
        Cliente cliente1 = new Cliente("Turma do pagode", 9089879, ped2);

        ListaPedidos.adicionar(cliente1);
        cliente1.Calcula();
        //ListaPedidos.adicionar(ped2);
        ListaPedidos.listar();
        
        
        
        
    }
    
}
