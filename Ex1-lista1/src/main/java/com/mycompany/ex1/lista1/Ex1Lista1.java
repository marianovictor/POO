/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ex1.lista1;
import com.mycompany.ex1.lista1.Cadastro;
import com.mycompany.ex1.lista1.ImpostoRenda;
/**
 *
 * @author victorrocha
 */
public class Ex1Lista1 {
    
    

    public static void main(String[] args) {
        Cadastro cadastra = new Cadastro();
        ImpostoRenda ir1 = new ImpostoRenda();
        
        
        cadastra.setNome("Victor Mariano rocha");
        cadastra.setCpf(4905);
        cadastra.setSalario(3000);
        
        cadastra.imprimeCadastro();
        
        ir1.calcula(cadastra.getSalario());
    }
}
