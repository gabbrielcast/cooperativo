/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package triangulo;

/**
 *
 * @author Ethan
 */
public class Triangulo {

    //area de un triangulo rectangulo o de cualquier rectangulo
    public static double area(double base, double altura) {
        double area = (base * altura) / 2;
        return area;
    }

    //area de un triangulo equilatero
    public static double area(double ladoA) {
        double raiz = Math.sqrt(3);
        double area = ((raiz / 4) * (ladoA * ladoA));
        return area;
    }

    //area de un triangulo isosceles
    public static double area(double ladoA, int anguloB) {
        double radianesAnguloB = Math.toRadians(anguloB);
        double area = ((ladoA * ladoA) / 2) * Math.sin(radianesAnguloB);
        return area;
    }

    //otra formula
    public static double area(double ladoA, int anguloB, int anguloC) {
        double radianesAnguloB = Math.toRadians(anguloB);
        double radianesAnguloC = Math.toRadians(anguloC);
        double area = ((ladoA * ladoA) * Math.sin(radianesAnguloB) * Math.sin(radianesAnguloC)) / (2 * Math.sin(radianesAnguloB + radianesAnguloC));
        return area;
    }
}
