/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author samaniw
 */
public class Recursividad {

    public int sumatoria(int n) {
        System.out.println("");
        if (n == 1) {
            return 1;
        } else {
            System.out.println("");
            return n + sumatoria(n - 1);
        }
    }

    public double factorial(double n) {
        System.out.println("");
        //caso base
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }

    }

    /**
     * Muestra el n-avo elemento de la secuencia
     *
     * @param n Es la posición del dato que se desea mostrar
     * @return Un dato ubicado en la posición n
     */
    public int fibonacci(int n) {
        System.out.println("");
        //caso base
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            System.out.println("");
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    /**
     * Serie de fibonacci
     *
     * @param n Cuantos datos de la serie se van a mostrar
     */
    public void serieFibonacci(int n) {
        //inicialización de llamada recursiva
        serieFibonacciR(n, 0, 1);
    }

    private void serieFibonacciR(int n, int a, int b) {
        //caso base - caso de finalización
        if (n == 0) {
            return;//salir 
        } else {
            System.out.print(a + " ");
            serieFibonacciR(n-1,b,(a+b));
        }
    }

}
