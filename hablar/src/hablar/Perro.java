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
public class Perro extends Animal {

    @Override
    public String hablar() {
        return "gua, gua";
    }

    @Override
    public String desplazarse() {
        return "perro camina";
    }

    @Override
    public String jugar() {
        return "juego con un hueso";
    }

    @Override
    public String alimentarse() {
        return "comer pienso";
    }

    @Override
    public String dormir() {
        return "duerme perro";
    }
    
    
    
    
    
    
}
