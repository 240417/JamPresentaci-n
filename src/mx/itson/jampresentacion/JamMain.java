/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.jampresentacion;

import mx.itson.jam.nucleo.execepciones.ImpuestoException;
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
            Operacion o = new Operacion ();
            o.calcularIVA(450, 16);
        }catch(ImpuestoException ex){
            System.out.println("Ocurrio un error: "+ex.getMessage());
        }
        
    }
    
}
