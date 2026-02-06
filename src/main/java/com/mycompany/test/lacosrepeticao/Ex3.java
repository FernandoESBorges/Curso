/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test.lacosrepeticao;

import java.util.Scanner;

/**
 *
 * @author Ferna
 */
public class Ex3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int combustivel = sc.nextInt();
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (combustivel != 4) {
            if (combustivel == 1) {
                alcool += 1;

            } else if (combustivel == 2) {
                gasolina += 1;

            } else if (combustivel == 3) {
                diesel += 1;

            }
            combustivel = sc.nextInt();

        }
        System.out.println("Muito obrigado");
        System.out.println("Alcool:"+ alcool + "\n"+ "Gasolina:" + gasolina + "\n"+ "Diesel:" + diesel);
        

    }

}
