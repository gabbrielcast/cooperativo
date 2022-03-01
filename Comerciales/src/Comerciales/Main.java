/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comerciales;

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
        List<Comercial> listComerciales =new ArrayList<>();
        
        Comercial c1= new Comercial("gabriel",10, 5);
        Comercial c2= new Comercial("esteban",20, 2);
        Comercial c3= new Comercial("ethan",15, 8);
        Comercial c4= new Comercial("jose luis",5, 20);
        
        listComerciales.add(c1);
        listComerciales.add(c2);
        listComerciales.add(c3);
        listComerciales.add(c4);
        
        Collections.sort(listComerciales);
        
        for (Comercial datos: listComerciales) {
            System.out.print(datos);
        }
        
    }
    
}
