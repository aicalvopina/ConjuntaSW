/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.educat.examenconjunto;

/**
 * Clase Operaciones
 *
 * @author CRIS
 * @version 12/07/2017
 */
public class Operaciones {

    /**
     * Creacion de los metodo suma
     *
     * @param numero1 primer numero a sumar.
     * @param numero2 segundo numero a sumar.
     * @author CristhianArevalo
     */
    public int sumar(int numero1, int numero2) {
        return numero1 + numero2;
    }

    /**
     * Creacion de los metodo resta.
     *
     * @param numero1 primer numero a sumar.
     * @param numero2 segundo numero a sumar.
     * @author CristhianArevalo.
     */
    public int resta(int numero1, int numero2) {
        return numero1 + numero2;
    }

    /**
     * Creacion de los metodo potencia.
     *
     * @param base numero base de la potencia.
     * @param potencia numero potencia.
     * @author CristhianArevalo.
     */
    public int pontencia(int base, int potencia) {
        int resultado = (int) Math.pow(base, potencia);
        return resultado;
    }

    /**
     * Creacion de los metodo Modulo.
     *
     * @param numero1 numero al cual se le va obtener el modulo.
     * @param numero2 numero modulo.
     * @author CristhianArevalo.
     */
    public int modulo(int numero1, int numero2) {
        int modulo = numero1 % numero2;
        return modulo;
    }
    /**
     * Creacion de metodo suma flotante.
     * @param numero1 primero numero a suma
     * @param numero2 segundo numero a suma
     * @author Cristhian Arevalo  
     */
    
    
    public float sumaf(float numero1, float numero2)
     {
              
        return numero1+numero2;
    }
    

    /**
     * Creacion de metodo resta flotante.
     *
     * @param numero1 primero numero a resta.
     * @param numero2 segundo numero a resta.
     * @author Cristhian Arevalo
     */

    public float restaf(float numero1, float numero2) {
        return numero1 - numero2;
    }

    /**
     * CreaciÃ³n del mÃ©todo multiplicacion
     *
     * @param n1 primero numero a multiplicar
     * @param n2 segundo numero a multiplicar
     */
    int multiplicacion(int n1, int n2) {
        return n1 * n2;
    }

    /**
     * CreaciÃ³n del mÃ©todo division
     *
     * @param n1 primero numero a dividir
     * @param n2 segundo numero a dividir
     */
    int division(int n1, int n2) {
        return n1 / n2;
    }
    /**
     * CreaciÃ³n del mÃ©todo multiplicacionf
     *
     * @param n1 primero numero a multiplicar
     * @param n2 segundo numero a multiplicar
     */
    float multiplicacionf(float n1, float n2) {
        return n1 * n2;
    }

    /**
     * CreaciÃ³n del mÃ©todo divisionf
     *
     * @param n1 primero numero a dividir
     * @param n2 segundo numero a dividir
     */
    float divisionf(float n1, float n2) {
        return n1 / n2;
    }


}
