/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade01.Repositorio;

import java.util.ArrayList;
import java.util.List;
import atividade01.Cliente.Cliente;

/**
 *
 * @author victorrocha
 */
public class ListaPedidos {
     private static List<Cliente> listaPedidos = new ArrayList<Cliente>();
     
     public static void adicionar(Cliente pedido) {
        listaPedidos.add(pedido);
    }

    public static void remover(Cliente pedido) {
        listaPedidos.remove(pedido);
        System.out.println("Pedido " + pedido.getPedido().getLanche().getIdentificador() + ", entregue");
    }

    public static void listar() {
        System.out.println("\n\n------------------------");
        System.out.println("\nLista com todos os clientes em ordem: ");
        for (Cliente p : listaPedidos) {
            System.out.println(p);
        System.out.println("------------------------\n\n");
        }
    }
    
    

    
}
