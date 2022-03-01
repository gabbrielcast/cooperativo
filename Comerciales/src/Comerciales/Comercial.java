/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comerciales;

/**
 *
 * @author alumno
 */
public class Comercial implements Comparable<Comercial> {

    private String nombre;
    private long codigo;
    private int ventasIphone;
    private int ventasIpad;

    public Comercial(String nombre, int ventasIphone, int ventasIpad) {
        this.nombre = nombre;
        this.ventasIphone = ventasIphone;
        this.ventasIpad = ventasIpad;
        codigo++;
    }
    
    
    
    

    @Override
    public int compareTo(Comercial o) {
        int numero = 0;
        if (this.ventasIphone < o.ventasIphone) {
            numero = -1;
        }
        if (this.ventasIphone > o.ventasIphone) {
            numero = 1;
        }
        return numero;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", ventasIphone=" + ventasIphone + "\n";
    }
    
    
    

}
