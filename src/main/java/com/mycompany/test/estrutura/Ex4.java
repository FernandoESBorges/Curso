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
public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int horas = sc.nextInt();
        double valorHora = sc.nextDouble();
        double salario = valorHora * horas;
        
        System.out.printf("Numero: %s%nSalario: %2f",x,salario);
        
        
    }
            
    
}
