/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Ferna
 */
public class Comentarios {

    /*
Este programa calcula as raízes de uma equação do segundo grau

Os valores dos coeficientes devem ser digitados um por linha
     */

    public class Program {

        public static void main(String[] args) {

            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            double a, b, c, delta;

            System.out.println("Digite os valores dos coeficientes:");
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();

            delta = b * b - 4 * a * c; // cálculo do valor de delta
        }
    }

}
 