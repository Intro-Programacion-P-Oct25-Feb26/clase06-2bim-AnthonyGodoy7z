/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Ejercicio01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor1 = ingresarValor();
        int valor2 = ingrsarValor();
        int resultado = obtenerDatos();
    }

    public static int ingresarValor() {
        Scanner entrada = new Scanner(System.in);

        boolean bandera = true;
        int valor = 0;

        while (bandera) {
            try {
                System.out.println("Ingrese valor 1 a operar: ");
                valor = entrada.nextInt();
                if(valor %2==0 && valor >= 0){
                    bandera = false;
                }
                if (valor < 0) {
                    throw new Exception("Error número negativo");
                }
                if (valor %2!= 0) {
                    throw new Exception("Error número impar");
                }
            } 
             catch (InputMismatchException e) {
                System.out.printf("(InputMismatchException) Ocurrió una "
                        + "excepción %s\n", e);
            } catch (Exception e) {
                System.out.printf("Ocurrió una excepción %s\n", e);
            }
        }

        return valor;
    }
}
