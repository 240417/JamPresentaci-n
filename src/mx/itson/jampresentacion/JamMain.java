/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.jampresentacion;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import mx.itson.jam.nucleo.execepciones.*;
import mx.itson.jamnucleo.Operacion;

/**
 *
 * @author medin
 */
public class JamMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        try{
            Scanner sr = new Scanner(System.in);
            Operacion o = new Operacion ();
            //o.calcularIVA(450, 16);
          List<Integer> lista = Arrays.asList(1,6,4,3,3,3,3,5,5,5,5);
          o.sumaNumeros(lista);
        }catch(CapacidadException ex){
            System.out.println("Ocurrio un error: "+ex.getMessage());
        }
        
    }
    
}
