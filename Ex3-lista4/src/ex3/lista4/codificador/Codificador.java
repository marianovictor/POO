/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3.lista4.codificador;
import java.util.Base64;
/**
 *
 * @author victorrocha
 */
public class Codificador {
    private String senhaRecebida;

    public Codificador() {
    }

    public Codificador(String senhaRecebida) {
        this.senhaRecebida = senhaRecebida;
    }

    public String getSenhaRecebida() {
        return senhaRecebida;
    }

    public void setSenhaRecebida(String senhaRecebida) {
        this.senhaRecebida = senhaRecebida;
    }
    
    public String codifica1(String senhaOriginal){
        String novaSenha1 = new StringBuilder(senhaOriginal).reverse().toString();   //reverte a senha original
        String novaSenha2 = Base64.getEncoder().encodeToString(novaSenha1.getBytes()); //transforma a senha invertida para Base64 
        String novaSenha3 = novaSenha2 + "$"; //adiciona um caracter especial no final da senha codificada
        return novaSenha3;
    }
    
    public String decodificar(String senhaCodificada){
        String senhaAnterior1 = senhaCodificada.replace("$", ""); //retira o caracter especial
        String senhaAnterior2 = new String(Base64.getDecoder().decode(senhaAnterior1)); //decodifica a Base64
        String senhaOriginal = new StringBuilder(senhaAnterior2).reverse().toString(); //inverte a senha para obter a original
        return senhaOriginal;
    }
    
     
}

