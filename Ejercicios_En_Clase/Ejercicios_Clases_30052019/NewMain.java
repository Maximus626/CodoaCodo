/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Clases_30052019;

/**
 *
 * @author Maximus626
 */
public class NewMain {



    public static void main(String[] args) {
String codigo = "J3AQV7A";

        for (int i = 0; i < codigo.length(); i++) {

            if (i % 2 == 0) {

                System.out.println(codigo.charAt(i));

            }

        }
    }
}