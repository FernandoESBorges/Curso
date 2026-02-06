/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test.lacosRepeticaoWhile;

import java.util.Scanner;

/**
 *
 * @author Ferna
 */
public class Ex1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int senha = sc.nextInt();

        while (senha != 2002) {

            System.out.println("Senha Invalida");
            senha = sc.nextInt();
        }
        System.out.println("Acesso Permitido");
        
        sc.close();
    }
}
