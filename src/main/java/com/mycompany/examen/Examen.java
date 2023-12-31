/*import java.util.Scanner;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen;

/**
 *
 * @author rahin
 */
public class Examen {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //CREARA ESCANER
        Scanner scanner  = new Scanner(System.in);
        //PONER UNA VARIABLE 
        System.out.print("edades de la persona");
        int edad = scanner.nextInt();
        
        if(edad >=18){
            System.out.println("mayor de edad");
        }else if (edad >= 60){
            System.out.println("la tercera edad");
        }else if (edad < 3){
            System.out.println("Un bebe ");
        }else{
            System.out.println("edad media  intermedio");
        }  
            
        scanner.Close();
    }
}
