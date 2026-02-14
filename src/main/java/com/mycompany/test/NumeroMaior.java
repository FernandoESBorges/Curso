/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

import java.util.Scanner;

/**
 *
 * @author Ferna
 */
public class NumeroMaior {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int higher = max(a, b, c);
        
        showResult(higher);

    }

    public static int max(int x, int y, int z) {

        int aux;
        

          if (x > y && x > z) {

            aux = x;

        } else if (y > z) {
            aux = y;

        } else {

            aux = y;

        }
        return aux;
    }
    
    public static void  showResult(int result){
    
        System.out.println("Maior = "+ result);
    }

}
