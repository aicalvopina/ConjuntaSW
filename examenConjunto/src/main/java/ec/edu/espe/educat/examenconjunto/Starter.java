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
            System.out.print("\n1. Suma:\n ");
            System.out.print("\n2. Resta:\n ");
            System.out.print("\n3. Multiplicación:\n ");
            System.out.print("\n4. División:\n ");
            System.out.print("\n1. Suma Flotante:\n ");
            System.out.print("\n2. Resta Flotante:\n ");
            System.out.print("\n3. Multiplicación Flotante:\n ");
            System.out.print("\n4. División Flotante:\n ");
            try {
                numero = in.nextInt();
                aux = 1;
            } catch (Exception ex) {
                System.out.print("\nIngrese solo nÃºmeros\n");
                aux = 0;
            }
        } while (aux == 0);
        float operador1 = 0;
        float operador2 = 0;
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
                System.out.print("El resultado de la suma es: " + operaciones.suma((int)operador1,(int) operador2));
                break;
            case 2:
                System.out.print("El resultado de la resta es: " + operaciones.resta((int)operador1,(int) operador2));
                break;
            case 3:
                System.out.print("El resultado de la multiplicacion es: " + operaciones.multiplicacion((int)operador1,(int) operador2));
                break;
            case 4:
                System.out.print("El resultado de la división es: " + operaciones.division((int)operador1,(int) operador2));
                break;
            case 5:
                System.out.print("El resultado de la suma de flotantes es: " + operaciones.sumaf(operador1, operador2));
                break;
            case 6:
                System.out.print("El resultado de la resta de flotantes es: " + operaciones.restaf(operador1, operador2));
                break;
            case 7:
                System.out.print("El resultado de la multiplicacion de flotantes es: " + operaciones.multiplicacionf(operador1, operador2));
                break;
            case 8:
                System.out.print("El resultado de la división de flotantes es: " + operaciones.divisionf(operador1, operador2));
                break;
        }
    }
}
