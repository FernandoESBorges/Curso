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
public class Ex4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            
            double div = num1 / num2;
            
            if (num1 == 0) {
                
                System.out.println("divisao impossivel");
                
            }
            System.out.println("Div: "+ div);
            
        }
    }
}
