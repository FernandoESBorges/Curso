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
public class Ex1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x, y;
        x = sc.nextInt();
        y = sc.nextInt();
        int total = x+y;
        
        System.out.printf("Valor 1: %s,%nvalor 2:%s %n", x,y);
        System.out.printf("Total %s",total);
    }

}
