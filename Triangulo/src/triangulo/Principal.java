/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triangulo;

/**
 *
 * @author Ethan
 */
public class Principal {

    public static void main(String[] args) {

        
        System.out.println("Triangulo equilatero sabiendo un lado: " + Triangulo.area(3));
        System.out.println("Triangulo base y altura: " +Triangulo.area(3, 5));
        System.out.println("Un lado y dos Angulos: " + Triangulo.area(3, 5, 7));
        System.out.println("Un lado y un angulo" + Triangulo.area(3, 5.0));

    }
}
