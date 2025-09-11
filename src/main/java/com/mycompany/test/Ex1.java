/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.test;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Ferna
 */
public class Ex1 {

    public static void main(String[] args) {
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'f';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;
        
        
        System.out.println("Products:");
        System.out.printf("%s, which price is $ %.2f%n%s, which price is $ %.2f%n%n", product1,price1,product2,price2);
        System.out.printf("Record: %d years old, code %d and gender: %s %n%n",age, code, gender);
        System.out.printf("Measue witch eight decimal places: %.8f%nRouded(Theree decimal places): %.3f%nUs decimal point: %.3f%n",measure,measure,measure);
        
        
         
        
        
    }
}
