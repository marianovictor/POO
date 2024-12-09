/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex1.lista1;

/**
 *
 * @author victorrocha
 */
public class Cadastro{
         private String nome;
         private int cpf;
         private int salario;
         
         public Cadastro(){
             
         }

        public Cadastro(String nome, int cpf, int salario) {
            this.nome = nome;
            this.cpf = cpf;
            this.salario = salario;
        }

        

        public void setCpf(int cpf) {
            this.cpf = cpf;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setSalario(int salario) {
            this.salario = salario;
        }
        public int getCpf() {
            return cpf;
        }

        public String getNome() {
            return nome;
        }

        public int getSalario() {
            return salario;
        }
        
        public void imprimeCadastro() {
            System.out.print("Nome: "+ getNome());
            System.out.print("\nCpf: "+ getCpf());
            System.out.print("\nSalario: "+ getSalario());
        }
        
         
    }
