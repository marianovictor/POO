/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.pessoamaven;

import com.mycompany.tecladomaven.modelo.Teclado;

import com.mycompany.pessoamaven.modelo2.Pessoa2;

/**
 *
 * @author victorrocha
 */
public class PessoaMaven {

    public static void main(String[] args) {
        Pessoa2 p1 = new Pessoa2();

        p1.setId(1);
        p1.setIdade(20);
        p1.setNome("Victor");

        System.out.println(p1);

        Pessoa2 p2 = new Pessoa2();
        System.out.println("Digite seu nome: ");
        p2.setNome(Teclado.leituraString());
        
        System.out.println("Digite sua idade: ");
        p2.setIdade(Teclado.leituraInt());
        
        System.out.println("Digite um identificador: ");
        p2.setId(Teclado.leituraInt());
        
        System.out.println(p2);
    }
}
