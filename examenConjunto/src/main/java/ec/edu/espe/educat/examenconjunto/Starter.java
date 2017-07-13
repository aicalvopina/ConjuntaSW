/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.educat.examenconjunto;

import java.util.Scanner;

/**
 * Clase principal que servira de menu para el proyecto.
 *
 * @author adrian
 */
public class Starter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
        *Objeto de la clase operaciones para 
         */
        Operaciones operaciones = new Operaciones();
        boolean banderaTry;
        Scanner in = new Scanner(System.in);
        System.out.print("\n ----------------------------------------------------");
        System.out.print("\n\t\t MENU PRINCIPAL");
        System.out.print("\n ----------------------------------------------------");
        int aux;
        int numero = 1;
        do {
            do {
                System.out.print("\n1. Suma:\n ");
                System.out.print("\n2. Resta:\n ");
                System.out.print("\n3. Multiplicación:\n ");
                System.out.print("\n4. División:\n ");
                try {
                    numero = in.nextInt();
                    aux = 1;
                } catch (Exception ex) {
                    System.out.print("\nIngrese solo nÃºmeros\n");
                    aux = 0;
                }
            } while (aux == 0);
            int operador1=0;
            int operador2=0;
            try {
                    System.out.print("Ingrese el primer Operando: ");
                    operador1 = in.nextInt();
                    System.out.print("Ingrese el segundo Operando: ");
                    operador2 = in.nextInt();
                    aux = 1;
                } catch (Exception ex) {
                    System.out.print("\nIngrese solo nÃºmeros\n");
                    aux = 0;
                }
            switch (numero) {
                case 1:
                    System.out.print("El resultado de la suma es: " + operaciones.sumar(operador1, operador2));
                    
                    break;
                case 2:
                    System.out.print("El resultado de la resta es: " + operaciones.resta(operador1, operador2));
                    break;
                case 3:
                    System.out.print("El resultado de la multiplicacion es: " + operaciones.multiplicacion(operador1, operador2));
                    break;
                case 4:
                    System.out.print("El resultado de la división es: " + operaciones.division(operador1, operador2));
                    break;
            }
        } while (true);
    }

}
