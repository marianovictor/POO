/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex2.lista1;

/**
 *
 * @author victorrocha
 */
public class Estatisticas {

    public int totalCanditadosVaga(int... canditados) {
        int total = 0;
        for (int i : canditados) {
            total += i;
        }

        return total;
    }

    public double candidatoVaga(int candidatos, int vagas) {
        double candidatoVagas = 0.0;
        candidatoVagas = (double) candidatos / vagas;

        return candidatoVagas;

    }


}
