/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author Michał
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Podaj imie ");
        String name = in.nextLine();
        System.out.println("Podaj rok");
        String age = in.nextLine();
        
        System.out.println("Witaj użytkowniku " + name + " to będzie " + (age) + " rok twojego życia");
        // TODO code application logic hereMich
    }
    
}
