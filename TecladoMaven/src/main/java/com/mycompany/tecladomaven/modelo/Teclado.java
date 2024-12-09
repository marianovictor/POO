/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tecladomaven.modelo;

import java.util.Scanner;

/**
 *
 * @author victorrocha
 */
public class Teclado {

    private Teclado() {
    }

    public static String leituraString() {
        Scanner sc = new Scanner(System.in);

        return sc.nextLine();
    }
    public static int leituraInt() {
        Scanner sc = new Scanner(System.in);

        return sc.nextInt();
    }

}