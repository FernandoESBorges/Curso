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
public class Ex3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        int total = (a * b - c * d);
        
        System.out.printf("Entradas %n%s%n%s%n%s%n%s%nDiferenca: %s",a,b,c,d,total);
        
    }

}
