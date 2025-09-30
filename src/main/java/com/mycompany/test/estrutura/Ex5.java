/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test.estrutura;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Ferna
 */
public class Ex5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String codigo1, codigo2;
        int num1, num2;
        double valor1, valor2;

        codigo1 = sc.nextLine();
        num1 = sc.nextInt();
        valor1 = sc.nextDouble();
        System.out.println("Coisas para o segundo:");
        sc.nextLine();
        codigo2 = sc.nextLine();
        num2 = sc.nextInt();
        valor2 = sc.nextDouble();
        double total = num1 * valor1 + valor2 * num2;
        System.out.println("Valor a ser pago: " + total);

    }

}
