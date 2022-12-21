/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package calculadora;

import java.util.Scanner;

/**
 *
 * @author DAW132
 */
public class Calculadora {

     Scanner scanner = new Scanner(System.in);
        
     int numero1 = 0, numero2 = 0; //Variables de entrada
    public void main(String[] args) {
        System.out.println("Bienvenido a la calculadora");
        int opcion = -1; //opciÃ³n del menÃº
        while (opcion != 0) {
                System.out.println("Elige opciÃ³n:\n" + ""
                        + "1.- Sumar\n"
                        + "2.- Restar\n"
                        + "3.- Multiplicar\n"
                        + "4.- Dividir\n"
                        + "0.- Salir");

                System.out.println("Selecciona una opciÃ³n de 0 a 4");
                opcion = scanner.nextInt();
                switch (opcion) {
                    case 1 -> {
                        pideNumeros();
                        System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2));
                    }
                    case 2 -> {
                        pideNumeros();
                        System.out.println(numero1 + " - " + numero2 + " = " + (numero1 - numero2));
                    }
                    case 3 -> {
                        pideNumeros();
                        System.out.println(numero1 + " * " + numero2 + " = " + (numero1 * numero2));
                    }
                    case 4 -> {
                        pideNumeros();
                        System.out.println(numero1 + " / " + numero2 + " = " + (numero1 / numero2));
                    }
                    case 0 -> System.out.println("Saliendo...");
                    default -> System.out.println("OpciÃ³n no disponible");
                }

                System.out.println("\n");
        }

    }

    //MÃ©todo para recoger las variables de entrada
    public  void pideNumeros() {
        System.out.println("Introduce el primer nÃºmero:");
        numero1 = scanner.nextInt();

        System.out.println("Introduce el segundo nÃºmero:");
        numero2 = scanner.nextInt();
       
    
    }
}
