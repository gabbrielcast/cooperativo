/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comerciales2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author alumno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Comercial> listComercial=new ArrayList<>();
        
        
        Comercial c1=new Comercial("gabriel",10,30);
        Comercial c2=new Comercial("esteban",20,5);
        Comercial c3=new Comercial("ethan",40,15);
        Comercial c4=new Comercial("jose",30,1);
        
        listComercial.add(c1);
        listComercial.add(c2);
        listComercial.add(c3);
        listComercial.add(c4);
        
        //ORDENAR POR VENTASIPAD
        Collections.sort(listComercial, new VentaIpad());
        
        System.out.println("<<Ordenados por Ventas Ipad>>" + "\n");
        
        for (Comercial datos:listComercial) {
            System.out.print(datos);
        }
        System.out.println("");
        
        //ORDENAR POR VENTASIPHONE
        Collections.sort(listComercial, new VentaIphone());
        
        System.out.println("<<Ordenados por Ventas Iphone>>" + "\n");
        
        for (Comercial datos:listComercial) {
            System.out.print(datos);
        }
    }
    
}
