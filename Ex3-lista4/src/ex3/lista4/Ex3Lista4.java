/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3.lista4;

import java.util.Scanner;
import ex3.lista4.codificador.Codificador;
/**
 *
 * @author victorrocha
 */
public class Ex3Lista4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String senhaCodificada;
         
         System.out.println("Digite sua senha: ");
         String senha = sc.nextLine();
         
         System.out.println("Senha original: "+ senha);
         
         Codificador hash = new Codificador(senha);
         senhaCodificada = hash.codifica1(senha);
         System.out.println("Senha codificada: "+ senhaCodificada);
         
        System.out.println("Senha decodificada: "+ hash.decodificar(senhaCodificada));
    }
    
}
