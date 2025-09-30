/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test.estrutura;

import java.util.Scanner;

/**
 *
 * @author Ferna
 */
public class Ex2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double raio = sc.nextDouble();
        double tt = 3.14159;

        double total = tt * raio * raio;

        System.out.println("Entrada: " + raio);
        System.out.println("Resultado da área: " +total);
    }

}
