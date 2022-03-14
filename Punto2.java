package taller.pkg2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */

public class Punto2 {
    
    public static void main(String[] args) {
        int n1 = 5, n2 = 7, n3 = 4;
        float suma, promedio, produc, coci, modu;
        suma = n1 + n2 + n3;
        promedio = suma/3;
        produc = n1 * n2 * n3;
        coci = n1 / n2 / n3;
        modu = (n1 % n2 % n3);
         
         System.out.printf("El suma de los numeros es: "+suma+"\n");
         System.out.printf("El promedio de los numeros es: "+promedio+"\n");
         System.out.printf("El producto de los numeros es: "+produc+"\n");
         System.out.printf("El modulo resultante es: "+modu+"\n");
         
         
    }
}

