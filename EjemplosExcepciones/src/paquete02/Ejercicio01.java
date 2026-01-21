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
        int valor1 = ingresarValor();
        int valor2 = ingresarValor();
        int suma = obtenerSuma(valor1, valor2);
        String reporte = obtenerReporte(valor1, valor2, suma);
        imprimir(reporte);
    }

    public static int ingresarValor() {
        boolean bandera = true;
        int valor = 0;
        while (bandera) {
            try {
                Scanner entrada = new Scanner(System.in);
                System.out.println("Ingrese valor a operar: ");
                valor = entrada.nextInt();
                if (valor < 0) {
                    throw new Exception("Error número negativo");
                }
                if (valor %2!= 0) {
                    throw new Exception("Error número impar");
                }
                bandera = false;
            } 
             catch (InputMismatchException e) { // otro tipo =! int
            System.out.printf("(InputMismatchException) Ocurrió una "
                    + "excepción %s\n", e);
            } catch (Exception e) { // impar o menor a 0
            System.out.printf("Ocurrió una excepción %s\n", e);
            }
        }

        return valor;
    }
    
    public static int obtenerSuma(int a, int b){
        int suma;
        suma = a + b;
        return suma;
    }
    
    public static String obtenerReporte(int a, int b, int c){
        String mensaje;
        mensaje = String.format("El resultado de la suma de %d y %d es: %d\n", 
                a, b, c);
        return mensaje;
    }
    
    public static void imprimir(String a){
        System.out.printf(a);
    }
}
