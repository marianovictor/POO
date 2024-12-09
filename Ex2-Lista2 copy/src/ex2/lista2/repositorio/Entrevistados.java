/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2.lista2.repositorio;

import java.util.ArrayList;
import java.util.List;

import ex2.lista2.modelo.Eleitor;

/**
 *
 * @author victorrocha
 */
public class Entrevistados {

   
    public static List<Eleitor> listaEntrevistados = new ArrayList<>();

    public static void adcicionar(Eleitor cadastro) {
        listaEntrevistados.add(cadastro);
    }

    public static void remover(Eleitor cadastro) {
        listaEntrevistados.remove(cadastro);
    }

    public static void conta() {
        int contaEntrevistado = 0;
        for (Eleitor cadastro : listaEntrevistados) {
            contaEntrevistado++;
        }
        System.out.println("Total de entrevistados: " + contaEntrevistado);
    }

    public static void listar() {
        System.out.println("\n\n------------------------");
        System.out.println("\nLista com todos os entrevistados: ");
        for (Eleitor cadastro : listaEntrevistados) {
            System.out.println(cadastro);
        }
        System.out.println("------------------------\n\n");
    }

    

}
