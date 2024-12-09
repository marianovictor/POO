/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4.lista4;
import ex4.lista4.geradorCodigo.Atributos;
import ex4.lista4.geradorCodigo.GeradorCodigo;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author victorrocha
 */
public class Ex4Lista4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        String nomeClasse;
        String nomePacote;
        Set<String> modificadorAtributo = new HashSet<>();
        Set<String> tipoAtributo = new HashSet<>();
        Set<String> nomeAtributo = new HashSet<>();
        
        int contador = 0;
        int parar = 0;
        
        System.out.println("Digite o nome do pacote: ");
        nomePacote = sc.nextLine();
        
        System.out.println("Digite o nome da classe: ");
        nomeClasse = sc.nextLine();
       
        GeradorCodigo GC = new GeradorCodigo(nomeClasse, nomePacote);
        
        
       while(parar == 0){
           Atributos AT = new Atributos();
           
            System.out.print("\nDigite o modificdor do atributo: ");
            AT.setModificadorAtributo(sc.next());
            
            System.out.print("\nDigite o tipo do atributo: ");
            
            AT.setTipoAtributo(sc.next());
            
            System.out.print("\nDigite o nome do atributo: ");
            
            AT.setNomeAtributo(sc.next());
            
            GC.adicionaAtributo(AT);
            System.out.print("\nDigite 0 para continuar adicionando atributos: ");
            parar = sc.nextInt();
            
            GC.adicionaAtributo(AT);
       }
       
       
       
       GC.geraCodigo();
        
    }

}
