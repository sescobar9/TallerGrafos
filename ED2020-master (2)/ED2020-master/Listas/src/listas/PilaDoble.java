/*
¿Cómo se podrían implementar dos pilas en una mismo 
arreglo? Si se supone que una pila crecerá de la 
primera posición hacia adelante y que otra crecerá 
de la última posición hacia atrás en el arreglo, 
y que cada una tiene un apuntador (tope1, tope2) 
que indica la posición del último elemento añadido 
en cada pila, ¿cuál es la condición para detectar 
que las pilas están llenas?

 */
package listas;

/**
 *
 * @author samaniw
 */
public class PilaDoble {

    //definir el arreglo numérico
    private int[] datos;
    private int pila1;
    private int pila2;
    private int totalDatos;
    private int max;

    //definir el constructor
    public PilaDoble(int n) {
        datos = new int[n];
        pila1 = 0;
        pila2 = n - 1;
        totalDatos = 0;
        max = n;
    }

    public void agregarDatoPila1(int d) {
        if (validarLLeno()) {
            System.out.println("Pila llena!!");
        } else {
            datos[pila1++] = d;
            totalDatos++;
        }

    }

    public void agregarDatoPila2(int d) {
        if (validarLLeno()) {
            System.out.println("Pila llena!!");
        } else {
            datos[pila2--] = d;
            totalDatos++;
        }
    }

    public boolean validarLLeno() {
        return totalDatos == max;
    }

}
