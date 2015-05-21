/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.lang.Math;


/**
 *
 * @author honoratosh
 */
public class Biseccionador {

     /**
     * atributos de tipo double para ma, mb y c
     */
    public Funcion f;
    double ma, mb, c;
    
    /**
     * método que asigna valores a ma, mb asigna una funcion
     * @param a atributo de tipo double
     * @param b atributo de tipo double
     * @param la_funcion
     */
    public Biseccionador(double a, double b, Funcion la_funcion){
    	ma = a;
    	mb = b; 
    	f = la_funcion;
    }
    
     /**
     * método que obtiene el resultado de c
     * @param x atributo de tipo double
     * @return devuelve c de tipo double
     */
public double calcular (double x){
        
        if(f.Funcion(ma) * f.Funcion(mb) > 0){
        
            System.out.println("No hay raices en la funcion introducida");
        

        }else {
            
              do {
                    c = (ma + mb)/2;
                    if ((f.Funcion(ma)*f.Funcion(c)) < 0) {
                       mb = c; 
                   System.out.println("a");
                   }else  {
                        ma = c;
                    System.out.println("b");
                    }
              } while(Math.abs(ma-mb) > x && f.Funcion(c) !=0);
        
        
        } return c;
    }
    
}
