/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test.lacosRepeticaoFor;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Ferna
 */
public class Ex3 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantas medias quer ");
        int x = sc.nextInt();

        for (int i = 0; i < x; i++) {

            double num1 = sc.nextDouble();
            double num2 = sc.nextDouble();
            double num3 = sc.nextDouble();

            double media = ((num1 * 2) + (num2 * 3) + (num3 * 5)) / 10;

            System.out.printf("%.1f%n", media);
        }
    }
}
