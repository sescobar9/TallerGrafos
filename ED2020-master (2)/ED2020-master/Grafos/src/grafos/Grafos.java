/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

import java.util.HashMap;
import java.util.PriorityQueue;

/**
 *
 * @author samaniw
 */
public class Grafos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        GrafoDinamico SuperGrafo = new GrafoDinamico();
        SuperGrafo.agregarNodo("A");
        SuperGrafo.agregarNodo("B");
        SuperGrafo.agregarNodo("C");
        SuperGrafo.agregarNodo("D");
        SuperGrafo.agregarArco("A", "B", 2);
        SuperGrafo.agregarArco("B", "A", 2);
        SuperGrafo.agregarArco("B", "C", 2);
        SuperGrafo.agregarArco("B", "D", 5);
        SuperGrafo.agregarArco("A", "C", 5);
        SuperGrafo.agregarArco("C", "A", 5);
        SuperGrafo.agregarArco("C", "B", 2);
        SuperGrafo.agregarArco("C", "D", 1);
        SuperGrafo.agregarArco("D", "B", 5);
        SuperGrafo.agregarArco("D", "C", 1);
        System.out.println("Lista de adyacencia del grafo");
        System.out.println(SuperGrafo.mostrarListaAdyacencia());
        
        HashMap<String, NodoPeso> mapaRecorrido = SuperGrafo.Dijkstra("A");
        System.out.println("Mapa de recorrido");
        System.out.println("Destino   Peso total  Origen");
        for (String NodosMapa : mapaRecorrido.keySet()) {
            System.out.println(NodosMapa + "                 " + mapaRecorrido.get(NodosMapa).getPeso()+ "   " + mapaRecorrido.get(NodosMapa).getNodo());
        }
        
                
        
        
        //Prueba 1 de taller grafo
        GrafoN miniGrafo = new GrafoN(6);
        miniGrafo.agregarArco(0, 1);
        miniGrafo.agregarArco(0, 2);
        miniGrafo.agregarArco(1, 3);
        miniGrafo.agregarArco(2, 3);
        miniGrafo.agregarArco(2, 4);
        miniGrafo.agregarArco(3, 4);
        miniGrafo.agregarArco(3, 5);
        miniGrafo.agregarArco(4, 5);
        System.out.println("Vallidación 1: " + miniGrafo.validarEntradasSalidas());
        miniGrafo.agregarArco(0, 1);
        miniGrafo.agregarArco(1, 0);
        miniGrafo.agregarArco(1, 3);
        miniGrafo.agregarArco(3, 1);
        System.out.println("Vallidación 2: " + miniGrafo.validarEntradasSalidas());

        System.out.println("Matriz de adyacencia");
        System.out.println(miniGrafo.mostrarMatriz());
        System.out.println("Lista de adyacencia");
        System.out.println(miniGrafo.mostrarListaAdyacencia());
        System.out.println("Lista de arcos");
        System.out.println(miniGrafo.mostrarArcos());
        System.out.println("Recorrido en anchura");
        miniGrafo.recorridoAnchura(0);
        System.out.println("");
        System.out.println("Recorrido en profundidad");
        miniGrafo.recorridoProfundidad(0);
        System.out.println("");
        
        //Prueba Taller de grafos
        GrafoN miniGrafo0 = new GrafoN(4);
        miniGrafo0.agregarArco(0, 1);
        miniGrafo0.agregarArco(1, 2);
        miniGrafo0.agregarArco(2, 0);
        miniGrafo0.agregarArco(2, 3);
        miniGrafo0.agregarArco(3, 2);
        System.out.println("Matriz de adyacencia:");
        System.out.println(miniGrafo0.mostrarMatriz());
        System.out.println("tiene la mismas entradas y mismas salidas?"+miniGrafo0.validarEntradasSalidas());
        GrafoN miniGrafo1 = new GrafoN(7);
        miniGrafo1.agregarArco(0, 1);
        miniGrafo1.agregarArco(1, 0);
        miniGrafo1.agregarArco(2, 3);
        miniGrafo1.agregarArco(3, 2);
        miniGrafo1.agregarArco(4, 6);
        miniGrafo1.agregarArco(5, 4);
        miniGrafo1.agregarArco(6, 5);
        
        System.out.println(miniGrafo1.mostrarMatriz());
        System.out.println("tiene la mismas entradas y mismas salidas?"+miniGrafo1.validarEntradasSalidas());
        
        GrafoN miniGrafo2 = new GrafoN(3);
        miniGrafo2.agregarArco(0, 1);
        miniGrafo2.agregarArco(2, 0);
        System.out.println("Matriz de adyacencia:");
        System.out.println(miniGrafo2.mostrarMatriz());
        System.out.println("tiene la mismas entradas y mismas salidas?"+miniGrafo2.validarEntradasSalidas());

        //Ejemplo de mapa en Java: equivalente a diccionario en python/C# o arreglo asociativo en PHP
        /*double x = Double.MAX_VALUE;
        System.out.println(x);
        HashMap<String, Integer> mapa = new HashMap<>();
        mapa.put("A", 111);
        mapa.put("B", 222);
        mapa.put("C", 333);
        mapa.put("D", 444);
        mapa.put("E", 432);
        mapa.put("G", 566);
        mapa.put("Y", 566);

        System.out.println("Mostrar las llaves del mapa");
        System.out.println(mapa.keySet().toString());

        for (String llave : mapa.keySet()) {

            System.out.println(llave + ": " + mapa.get(llave));
        }

        PriorityQueue<Integer> cp = new PriorityQueue<>();
        cp.add(77);
        cp.add(88);
        cp.add(66);
        cp.add(55);
        cp.add(60);
        cp.remove();
        System.out.println(cp);
        
        PriorityQueue<NodoPeso> colaPriorizada = new PriorityQueue<>();
        colaPriorizada.add(new NodoPeso("B", 4));
        colaPriorizada.add(new NodoPeso("C", 2));
*/
    }

}
