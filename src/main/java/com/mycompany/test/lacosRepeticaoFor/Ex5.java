/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test.lacosRepeticaoFor;

import java.util.Scanner;

/**
 *
 * @author Ferna
 */
public class Ex5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int soma = 1;

        for (int i = n; i >=1; i--) {
            System.out.println(i);
            if (n == 0) {
                System.out.println("Resultado: 1");
                soma=1;

            }
            soma =soma * i ;
        }
        System.out.println("Fatorial: "+soma);
    }

}
