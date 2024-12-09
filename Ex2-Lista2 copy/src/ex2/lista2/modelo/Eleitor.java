/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2.lista2.modelo;
import ex2.lista2.modelo.Endereco;
import ex2.lista2.modelo.Voto;
/**
 *
 * @author victorrocha
 */
public class Eleitor {
    private String nome;
    private int numeroFilhos;
    private String dataNascimento;
    private String estadoCivil;
    private String storTrabalho;
    private double rendaBruta;
    Endereco endereco;
    private String voto;
    
    public Eleitor() {
    }

    public Eleitor(String nome, int numeroFilhos, String dataNascimento, String estadoCivil, String storTrabalho, double rendaBruta, Endereco endereco, String voto) {
        this.nome = nome;
        this.numeroFilhos = numeroFilhos;
        this.dataNascimento = dataNascimento;
        this.estadoCivil = estadoCivil;
        this.storTrabalho = storTrabalho;
        this.rendaBruta = rendaBruta;
        this.endereco = endereco;
        this.voto = voto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroFilhos() {
        return numeroFilhos;
    }

    public void setNumeroFilhos(int numeroFilhos) {
        this.numeroFilhos = numeroFilhos;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getStorTrabalho() {
        return storTrabalho;
    }

    public void setStorTrabalho(String storTrabalho) {
        this.storTrabalho = storTrabalho;
    }

    public double getRendaBruta() {
        return rendaBruta;
    }

    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getVoto() {
        return voto;
    }

    public void setVoto(String voto) {
        this.voto = voto;
    }

    @Override
    public String toString() {
        return "Cadastro{" + "nome=" + nome + ", numeroFilhos=" + numeroFilhos + ", dataNascimento=" + dataNascimento + ", estadoCivil=" + estadoCivil + ", storTrabalho=" + storTrabalho + ", rendaBruta=" + rendaBruta + ", endereco=" + endereco + ", voto=" + voto + '}';
    }
    
    
    
    
}
