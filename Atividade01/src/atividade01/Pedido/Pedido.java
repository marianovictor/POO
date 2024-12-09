/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade01.Pedido;
import atividade01.Cardapio.Lanche;
import atividade01.Cardapio.Suco;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author victorrocha
 */
public class Pedido {
    Lanche lanche;
    Suco suco;
    
    
    public Pedido() {
    }

    public Pedido(Lanche lanche, Suco suco) {
        this.lanche = lanche;
        this.suco = suco;
    }

    public Suco getSuco() {
        return suco;
    }

    public void setSuco(Suco suco) {
        this.suco = suco;
    }
    
    

    public Lanche getLanche() {
        return lanche;
    }

    public void setLanche(Lanche lanche) {
        this.lanche = lanche;
    }

    @Override
    public String toString() {
        return "Pedido{" + "lanche=" + lanche + ", suco=" + suco + '}';
    }

    
    
    
}
