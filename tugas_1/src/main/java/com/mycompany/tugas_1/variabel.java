/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tugas_1;

import java.util.Scanner;

/**
 *
 * @author A-8
 */

public class variabel {
    public static void main(String[] args) {
        int nilaiA = 10;
        int nilaiB = 20;

        double nilaiDouble1 = 10;
        double nilaiDouble2 = 20;

        boolean isPlus = true;
    
        System.out.println("nilaiA = " + nilaiA);
        System.out.println("nilaiB = " + nilaiB);
        System.out.println("nilaiDouble1 = " + nilaiDouble1);
        System.out.println("nilaiDouble2 = " + nilaiDouble2);
        System.out.println("isPlus = " + isPlus);
      
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan nilai A: ");
        nilaiA = input.nextInt();
        System.out.println("nilaiA = " + nilaiA);
        
        System.out.println("Masukkan nilai Double: ");
        nilaiDouble1 = input.nextDouble();
        System.out.println("nilaiDouble1 = " + nilaiDouble1);
      
        System.out.println("Masukkan nilai boolean isPlus (true/false): ");
        isPlus = input.nextBoolean();
        System.out.println("isPlus = " + isPlus);
      
        input.nextLine();
        
        System.out.println("Masukkan nilai Variabel string: ");
        String nilaiString = input.nextLine();
        System.out.println("nilaiString = " + nilaiString);
    
    }}