package taller.pkg2;


import java.util.Scanner;

public class Punto1 {
    
    public static void main(String[] args) { 
        int x = 16;
        
        System.out.printf("x = %d\n",x );
        System.out.printf("El valor de %d + %d es %d\n",x,x,(x + x) );
        System.out.printf("El valor de %d / 2 = %.2f\n",x,(float)(x/2));
        System.out.printf("El valor de %d mod 3 = %d\n",x,x%3 );

    }
}
