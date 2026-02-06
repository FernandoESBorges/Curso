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
public class ForAula {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int soma = 0;

        for (int i = 0; i < n; i++) {

            int num = sc.nextInt();
            soma += num;

        }
        System.out.println(soma);
    }

}
