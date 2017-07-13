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
        Operaciones operacion;
        int numeroReparticiones = 0;
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
            switch (numero) {
                case 1:
                    //operaciones.suma();
                    break;
                case 2:
                    break;
                case 3:
                    operaciones.multiplicacion(aux, aux);
                    break;
                case 4:
                    operaciones.division(aux, aux);
                    break;
            }
        } while (true);
    }

}
