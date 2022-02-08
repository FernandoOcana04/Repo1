/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba_repositorio;

import java.util.Scanner;

/**
 *
 * @author Fernando Rubén Ocaña
 */
public class Prueba_Repositorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2;
        int suma, resta, multiplicacion, division;
        
        System.out.println("Ingrese dos números: ");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        
        suma = num1 + num2;
        System.out.println("La suma es: " + suma);
    }
    
}
