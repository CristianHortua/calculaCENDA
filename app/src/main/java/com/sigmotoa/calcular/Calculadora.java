package com.sigmotoa.calcular;

/**
 * Created by sigmotoa on 3/04/18.
 */

public class Calculadora {

    public static void main(String[] args) {

        Operaciones operar=new Operaciones();

        System.out.println(operar.sumar(3.0,5.2));
        System.out.println(operar.potencia(3,5));
        System.out.println(operar.raiz(3));
        
        
        System.out.println(operar.division(10.0 , 2.0));
        System.out.println(operar.divison(20,2));
       

    }
}
