/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2.lista2.modelo;

/**
 *
 * @author victorrocha
 */
public class Endereco {
    private String rua;
    private int numeroCasa;
    private String bairro;
    private String cidade;
    private int cep;
    private String estado;

    public Endereco() {
    }
    

    public Endereco(String rua, int numeroCasa, String bairro, String cidade, int cep, String estado) {
        this.rua = rua;
        this.numeroCasa = numeroCasa;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
        this.estado = estado;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Endereco{" + "rua=" + rua + ", numeroCasa=" + numeroCasa + ", bairro=" + bairro + ", cidade=" + cidade + ", cep=" + cep + ", estado=" + estado + '}';
    }
    
    
    
    
}
