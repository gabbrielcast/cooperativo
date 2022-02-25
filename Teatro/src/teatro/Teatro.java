/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teatro;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Teatro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Entrada ent1 = new Entrada("Mama mia", "11-03", TipoEntrada.PALCO);
        System.out.println("Precio base: " + ent1.precio());

        do {
            try {

                System.out.println("Descuento");
                double descuento = Double.parseDouble(sc.nextLine());
                ent1.precio(descuento);
                System.out.println(ent1.getPrecioBase());

                System.out.println("Quieres un traductor");
                boolean traductor = Boolean.parseBoolean(sc.nextLine());
                ent1.precio(traductor);
                System.out.println(ent1.getPrecioBase());

            } catch (Exception e) {
                sc = new Scanner(System.in);
                System.out.println("Te has equivocado en un dato");
            }
        } while (true);

    }
}
