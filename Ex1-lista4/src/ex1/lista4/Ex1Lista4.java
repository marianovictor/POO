/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1.lista4;
import java.util.Scanner;

/**
 *
 * @author victorrocha
 */
public class Ex1Lista4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        
        System.out.println("Digite um nome: ");
        String texto = sc.nextLine();
        
        String[] partesTexto = texto.split(" "); //Divide a String a partir de cada espaço em branco
        
        String ultimoSobrenome = partesTexto[partesTexto.length - 1].toUpperCase(); //Convertendo o ultimo nome para maiusculo e armazenando em uma variavel
    
        StringBuilder novoFormato = new StringBuilder();
        
        novoFormato.append(ultimoSobrenome).append(", ");
        
        for(int i =0; i<partesTexto.length; i++){
            String primeiraLetra = partesTexto[i].substring(0, 1).toUpperCase();
            novoFormato.append(primeiraLetra).append(". ");
        }
        
        System.out.println(novoFormato);
        
    }
        
    
}
