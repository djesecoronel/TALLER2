package taller.pkg2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coronel
 */
public class Punto3 {
    public static void main (String[] args) {
        
        double iva=0.12,utility=0.32,precio=80500.00;
        double Ivatot,Utitot,total;
        
        System.out.println("ARTICULO: JEAN");
        
            Ivatot= precio*iva;
            Utitot= precio * utility;
        
                total = precio + Ivatot + Utitot;
        
        System.out.printf("El precio final de venta del articulo es = %f%n", total);
        
    }
}
