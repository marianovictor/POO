/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex1.lista1;



/**
 *
 * @author victorrocha
 */
public class ImpostoRenda {
    
    public void calcula(int salario){
        if(salario <= 1500){
            System.out.println("\nVoce esta isento do imposto de renda!!");
        }else if((salario > 1500) && (salario <=2000)){
            
            System.out.print("Seu imposto de renda eh: " + (salario * 0.075));
            
        }else if((salario > 2000) && (salario <=3000)){
            
            System.out.print("Seu imposto de renda eh: " + (salario * 0.15));
            
        }else if((salario > 3000) && (salario <= 4000)){
            
            System.out.print("Seu imposto de renda eh: " + (salario * 0.225));
            
        }else if(salario > 4000){
            
            System.out.print("Seu imposto de renda eh: " + (salario * 0.275));
            
        }
    }
}
