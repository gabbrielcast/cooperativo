/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comerciales2;

import java.util.Comparator;

/**
 *
 * @author alumno
 */
public class VentaIphone implements Comparator<Comercial> {

    @Override
    public int compare(Comercial o1, Comercial o2) {
        int numero = 0;
        if (o1.getVentasIphone() < o2.getVentasIphone()) {
            numero = -1;
        }
        if (o1.getVentasIphone() > o2.getVentasIphone()) {
            numero = 1;
        }

        return numero;
    }

}
