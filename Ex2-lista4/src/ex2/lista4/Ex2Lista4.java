/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2.lista4;

import java.util.Scanner;

/**
 *
 * @author victorrocha
 */
public class Ex2Lista4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um texto: ");
        String texto = sc.nextLine();

        String[] palavrasTexto = texto.replace(",", "").replace(".", "").split(" "); //Divide a String a partir de cada espaço em branco
        int contador = 0;
        for (int i = 0; i < palavrasTexto.length; i++) {
            contador = 0;
            String palavraBuscada;

            palavraBuscada = palavrasTexto[i]; //armazena uma palavra

            for (int j = 0; j < palavrasTexto.length; j++) { //percorre o texto comparendo as palavras
                if (palavrasTexto[j].equalsIgnoreCase(palavraBuscada)) {
                    contador++;
                   
                }

            }

            System.out.println("A palavara '" + palavraBuscada + "' apareceu " + contador + " no texto");

        }
    }

}
