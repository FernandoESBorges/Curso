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
public class Ex7 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);  
        
        int x = sc.nextInt();
        
        for (int i = 1; i <= x; i++) {
            System.out.println((i)+" "+(i*i)+" "+(i*i*i));
            
        }
    }
    
}
