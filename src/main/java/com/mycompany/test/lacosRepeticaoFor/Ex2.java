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
public class Ex2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Numeros que serao digitados");
        int num = sc.nextInt();

        int contIn = 0;
        int contOut = 0;

        for (int i = 0; i < num; i++) {

            int x = sc.nextInt();

            if (x >= 10 && 20 >= x) {
                contIn += 1;
            } else {
                contOut += 1;
            }

        }
        System.out.println(contIn + " In \n" + contOut + " Out ");
    }

}
