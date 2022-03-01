/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comerciales2;



/**
 *
 * @author alumno
 */
public class Comercial {

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

    public int getVentasIphone() {
        return ventasIphone;
    }

    public int getVentasIpad() {
        return ventasIpad;
    }
    
   

    @Override
    public String toString() {
        return "nombre=" + nombre + ", ventasIphone=" + ventasIphone + ", ventasIpad=" + ventasIpad + "\n";
    }

}
