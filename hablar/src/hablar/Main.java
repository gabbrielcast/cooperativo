/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hablar;

/**
 *
 * @author alumno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro p1=new Perro();
        Gato g1=new Gato();
        Hombre h1=new Hombre();
        Mujer m1=new Mujer();
        
        System.out.println(p1.hablar() + ";\n" + g1.hablar() + ";\n" + h1.hablar() + ";\n" + m1.hablar());
        
        
    }
    
}
