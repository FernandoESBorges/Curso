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
public class Ex2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Double x;
        x = sc.nextDouble();
        
        System.out.printf("Voce digitou: %.2f%n",x );
        
        sc.close();
    }
    
}



    

