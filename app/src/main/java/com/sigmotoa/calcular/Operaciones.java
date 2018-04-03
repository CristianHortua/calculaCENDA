package com.sigmotoa.calcular;
import java.lang.Math;
/**
 * Created by sigmotoa on 3/04/18.
 */

public class Operaciones {

    public double sumar(double a, double b)
    {
        return a+b;
    }

    public int sumar(int a, int b)
    {
        return a+b;
    }
    
    pulbic int potencia(int a, int b){
        double op = new Math();
        return (int) op.pow(a,b);
    }
    
    public int raiz(int a ){
        int resultado = Matn.sqrt(a);
        return resultado;
    }
}
