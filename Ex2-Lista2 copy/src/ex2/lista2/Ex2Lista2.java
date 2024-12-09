/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2.lista2;

import ex2.lista2.modelo.Eleitor;
import ex2.lista2.modelo.Endereco;
import ex2.lista2.modelo.Voto;
import ex2.lista2.repositorio.Entrevistados;
import ex2.lista2.estatisticas.Estatisticas;
import ex2.lista2.modelo.EstadoCivil;

/**
 *
 * @author victorrocha
 */
public class Ex2Lista2 {

    public static void main(String[] args) {
      Eleitor cadastro1 =  new Eleitor();
      Endereco end1 = new Endereco();
      Voto voto1 = new Voto();
      EstadoCivil estado1 = new EstadoCivil();
      
      cadastro1.setNome("Victor Mariano");
      cadastro1.setDataNascimento("03-05-2002");
      cadastro1.setNumeroFilhos(0);
      cadastro1.setRendaBruta(1000.00);
      cadastro1.setStorTrabalho("Privado");
      
      
      end1.setBairro("Vila alema");
      end1.setCep(130506665);
      end1.setCidade("Rio claro");
      end1.setEstado("SP");
      end1.setNumeroCasa(145);
      end1.setRua("9A");
      
     
      
      cadastro1.setEndereco(end1);
      cadastro1.setVoto(voto1.Intencao(2));
      cadastro1.setEstadoCivil(estado1.Intencao(2));
      /////////////////////////////////////
      Eleitor cadastro2 =  new Eleitor();
      Endereco end2 = new Endereco();
      Voto voto2 = new Voto();
      EstadoCivil estado2 = new EstadoCivil();
      
      cadastro2.setNome("Frank");
      cadastro2.setDataNascimento("03-05-1980");
      cadastro2.setEstadoCivil("Casado");
      cadastro2.setNumeroFilhos(2);
      cadastro2.setRendaBruta(150.00);
      cadastro2.setStorTrabalho("Privado");
      
      
      end2.setBairro("Jd Garcia");
      end2.setCep(13045610);
      end2.setCidade("Campinas");
      end2.setEstado("SP");
      end2.setNumeroCasa(1145);
      end2.setRua("Av transzamazonica");
      
     
      

      
      cadastro2.setEndereco(end2);
      cadastro2.setVoto(voto2.Intencao(3));
      cadastro2.setEstadoCivil(estado2.Intencao(1));
      /////////////////////////////////////
      
      
     Entrevistados.adcicionar(cadastro1);
     Entrevistados.adcicionar(cadastro2);
     
     
     
     Entrevistados.conta();
     Entrevistados.listar();
     Estatisticas.ImprimeVoto();
     Estatisticas.IntencaoVotosEspecial(Entrevistados.listaEntrevistados);
     Estatisticas.ImprimeVotoEspecial();
     
      
    }
    
}
