/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ex2.lista1;

import com.mycompany.ex2.lista1.Curso;
import com.mycompany.ex2.lista1.Estatisticas;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author victorrocha
 */
public class Ex2Lista1 {

    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList();

        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        Estatisticas est = new Estatisticas();
        
        
        
        double maior = 0.0;
        int codigoMaior = 0;
        
        curso1.setCodigo(1);
        curso1.setNumeroVagas(30);
        curso1.setNumeroHomens(18);
        curso1.setNumeroMulheres(22);

        curso2.setCodigo(2);
        curso2.setNumeroVagas(35);
        curso2.setNumeroHomens(17);
        curso2.setNumeroMulheres(30);

        cursos.add(curso1);
        cursos.add(curso2);

        for (Curso i : cursos) {
            System.out.println("------------------------------------");
            System.out.println("Total candidato vaga para o curso" + i.getCodigo() + ": " + i.candidatoVaga());
            System.out.println("Porcentagem de candidatos do sexo feminino para o curso" + i.getCodigo() + ": " + (est.candidatoVaga(i.getNumeroMulheres(), i.getNumeroVagas())) * 100);
         
            if (i.candidatoVaga() > maior) {
                maior = i.candidatoVaga();
                codigoMaior=i.getCodigo();
            }
        }
        
       System.out.println("O maior numero de candidatos vaga eh: " + maior + " do curso de codigo: " + codigoMaior);

    }
}
