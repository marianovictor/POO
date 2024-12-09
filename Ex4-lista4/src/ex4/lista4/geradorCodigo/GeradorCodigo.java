/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex4.lista4.geradorCodigo;

import java.util.HashSet;
import java.util.Set;
import ex4.lista4.geradorCodigo.Atributos;
/**
 *
 * @author victorrocha
 */
public class GeradorCodigo {
    
    private String nomeClasse;
    private String nomePacote;
    Atributos atributo;
    Set<Atributos> atributos = new HashSet<>();

    public String getNomeClasse() {
        return nomeClasse;
    }

    public GeradorCodigo(String nomeClasse, String nomePacote) {
        this.nomeClasse = nomeClasse;
        this.nomePacote = nomePacote;
    }
    
    public void setNomeClasse(String nomeClasse) {
        this.nomeClasse = nomeClasse;
    }

    public String getNomePacote() {
        return nomePacote;
    }

    public void setNomePacote(String nomePacote) {
        this.nomePacote = nomePacote;
    }

    public void adicionaAtributo(Atributos atributo){
        atributos.add(atributo);
    }

    
    
    public void geraCodigo(){
        int contador =0;
        System.out.println("package "+nomePacote);
        System.out.println("public class  " + nomeClasse+"{");
        
        for(Atributos i : atributos){
            System.out.println("\t" + i.getModificadorAtributo() +" "+i.getTipoAtributo()+" " + i.getNomeAtributo() + ";");
        }
        
        
        System.out.println("\tpublic " + nomeClasse +"(){");
        System.out.println("}");
        
       
        System.out.println("\tpublic" + nomeClasse + "(");
        for(Atributos i : atributos){
            System.out.print(i.getTipoAtributo()+ " " + i.getNomeAtributo() + ", ");
        }
        System.out.print("){");
        for(Atributos i : atributos){
            System.out.println("\tthis."+ i.getNomeAtributo() + " = " + i.getNomeAtributo() + ";");
        }
        System.out.println("}");
        
       for(Atributos i : atributos){
            System.out.println("public " + i.getNomeAtributo() + "get" + i.getNomeAtributo() + "()" + "{");
            System.out.println("\treturn "+i.getNomeAtributo() +";");
            System.out.println("\t}");
            
            System.out.println("public void " + "set" + i.getNomeAtributo() + "(" + i.getTipoAtributo() + i.getNomeAtributo() + ")" + "{");
            System.out.println("\tthis."+ i.getNomeAtributo() + " = " + i.getNomeAtributo() + ";");
            System.out.println("\t}");
       }
       
       
        for(Atributos i : atributos){
            System.out.println("public " + i.getTipoAtributo() + "get" + i.getNomeAtributo() + "()" + "{");
            System.out.println("\treturn "+i.getNomeAtributo() +";");
            System.out.println("\t}");
            
            System.out.println("public void " + "set" + i.getNomeAtributo() + "(" + i.getTipoAtributo() + i.getNomeAtributo() + ")" + "{");
            System.out.println("\tthis."+ i.getNomeAtributo() + " = " + i.getNomeAtributo() + ";");
            System.out.println("\t}");
        }
        System.out.println("}");
    }
}
