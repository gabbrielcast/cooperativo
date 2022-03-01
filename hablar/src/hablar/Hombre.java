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
public class Hombre extends Humano {

    @Override
    public String tocarInstrumentos() {
        return "tocar guitarra";
    }

    @Override
    public String bailar() {
        return "bailar samba";
    }

    @Override
    public String estudiar() {
        return "ingles";
    }

    @Override
    public String trabajar() {
        return "web";
    }

    @Override
    public String hablar() {
        return "hola soy hombre";
    }

    @Override
    public String desplazarse() {
        return "caminando por la vida";
    }

    @Override
    public String jugar() {
        return "minecraft";
    }

    @Override
    public String alimentarse() {
        return "comer sandia";
    }

    @Override
    public String dormir() {
        return "tengo un sueño M.L.K";
    }

}
