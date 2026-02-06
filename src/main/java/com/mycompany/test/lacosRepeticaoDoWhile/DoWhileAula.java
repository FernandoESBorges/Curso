/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test.lacosRepeticaoDoWhile;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Ferna
 */
public class DoWhileAula {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        char resp;

        do {
            System.out.println("Digite a temperatura em celsius: ");

            double c = sc.nextDouble();
            double f = 9.0 * c / 5 + 32;

            System.out.printf("Equivalente em Fahrenheit: %.1f%n", f);
            System.out.print("Deseja Repitir (s/n)?");
            resp = sc.next().charAt(0);
        } while (resp != 'n');

        sc.close();
    }

}
