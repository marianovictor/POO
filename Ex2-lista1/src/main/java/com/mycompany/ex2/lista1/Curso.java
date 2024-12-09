/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex2.lista1;

import com.mycompany.ex2.lista1.Estatisticas;

/**
 *
 * @author victorrocha
 */
public class Curso {

    private int codigo;
    private int numeroVagas;
    private int numeroHomens;
    private int numeroMulheres;
    private int candidatos;
    private double candidatosVaga;

    Estatisticas est = new Estatisticas();

    public Curso() {
    }

    public Curso(int codigo, int numeroVagas, int numeroHomens, int numeroMulheres) {
        this.codigo = codigo;
        this.numeroVagas = numeroVagas;
        this.numeroHomens = numeroHomens;
        this.numeroMulheres = numeroMulheres;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNumeroVagas() {
        return numeroVagas;
    }

    public void setNumeroVagas(int numeroVagas) {
        this.numeroVagas = numeroVagas;
    }

    public int getNumeroHomens() {
        return numeroHomens;
    }

    public void setNumeroHomens(int numeroHomens) {
        this.numeroHomens = numeroHomens;
    }

    public int getNumeroMulheres() {
        return numeroMulheres;
    }

    public void setNumeroMulheres(int numeroMulheres) {
        this.numeroMulheres = numeroMulheres;
    }

    public double candidatoVaga() {
        candidatos = getNumeroMulheres() + getNumeroHomens();

        candidatosVaga = est.candidatoVaga(candidatos, numeroVagas);

        return candidatosVaga;
    }

    @Override
    public String toString() {
        return "Curso{" + "codigo=" + codigo + ", numeroVagas=" + numeroVagas + ", numeroHomens=" + numeroHomens + ", numeroMulheres=" + numeroMulheres + '}';
    }

}
