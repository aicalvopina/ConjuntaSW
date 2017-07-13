/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.isii.operaciones;

/**
 *
 * @author Labs-DECC
 */
public class Starter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char operacion = 'r';
        int numero1=4;
        int numero2=5;
        Operaciones ope = new Operaciones();
        switch (operacion) {
            case 's':
                int resultado = ope.suma(numero1, numero2);
                System.out.println("El resultado de suma es: " + resultado);
                break;
            case 'r':
                resultado = ope.resta(numero1, numero2);
                System.out.println("El resultado de resta es: " + resultado);
                break;
            case 'm':
                resultado = ope.multi(numero1, numero2);
                System.out.println("El resultado de multiplicaion es: " + resultado);
                break;
            case 'd':
                float resultado1 = ope.division(numero1, numero2);
                System.out.println("El resultado de division es: " + resultado1);
                break;
        }
    }

    private Starter() {
        
    }

}
