/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.jampresentacion;

import java.util.Scanner;
import mx.itson.jamnucleo.Operacion;

/**
 *
 * @author medin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        
        Operacion o = new Operacion();
        
        System.out.println("Ingresa un numero:");
        int a= sr.nextInt();
        
        System.out.println("Ingresa otro un numero:");
        int b= sr.nextInt();

        System.out.println(o.sumar(a, b));
    }
    
}
