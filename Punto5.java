package taller.pkg2;


import java.util.Scanner;

public class Punto5 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         
        int manzana, piña, pera, naranja, fresas, melon,calorias,numero;
      
        System.out.println("BIENVENIDO A MIS CALORIAS DIARAS");
        
            manzana = 52;
            piña = 55;
            pera = 55;
            naranja = 45;
            fresas = 32;
            melon = 54;
        
        System.out.println("¿Cuantas manzanas consumiste?: ");
            numero = entrada.nextInt();
                manzana = numero * manzana;
        
        System.out.println("¿Cuantas piñas comiste?: ");
            numero = entrada.nextInt();
                piña = numero * piña;
        
        System.out.println("¿Cuantas peras comiste?: ");
            numero = entrada.nextInt();
                pera = numero * pera;
        
        System.out.println("¿Cuantas naranjas comiste?: ");
            numero = entrada.nextInt();
                naranja = numero * naranja;
        
        System.out.println("¿Cuantas fresas comiste?: ");
            numero = entrada.nextInt();
                fresas = numero * fresas;
        
        System.out.println("¿Cuantas melones comiste?: ");
        numero = entrada.nextInt();
        melon = numero * melon;
        
        calorias = manzana + piña + pera + naranja + fresas + melon;
        
        System.out.println("el numero de calorias es: "+calorias);
        
    }
    
}


