package taller.pkg2;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coronel
 */
public class Punto4 {
    public static void main (String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int numdias,gaso;
        float km,promgaso,estacionamiento,peajepd,total;
        
        System.out.println("*****BIENVENDIO A TU CALCULA TU VIAJE******");
        
        System.out.print("¿Cantidad de dias de viaje?: \n");
            numdias = entrada.nextInt();
        
        System.out.print("¿Cantidad de Kilometros conducidos por Dia?: \n");
            km = entrada.nextFloat();
        
        System.out.println("Cual fue el costo del litro de Gasolina?: \n");
            gaso = entrada.nextInt();
        
                    promgaso = (km * gaso) / numdias;
        
        System.out.print("¿Cual fue el costo de estacionamiento por dia?: \n");
            estacionamiento = entrada.nextFloat();
        
        System.out.println("¿De cuanto fue el pago de peajes?: ");
            peajepd = entrada.nextInt();
        
                km = (estacionamiento + gaso) * numdias;
            peajepd = peajepd * numdias;
        
                    total = km + promgaso + peajepd;
        
        System.out.println("el promedio de kilemetros por litro de gasolina es: "+promgaso);
        System.out.print("el total a gastar por "+numdias+" dias de vaije es: "+total+"\n");
        
        
    }
}
