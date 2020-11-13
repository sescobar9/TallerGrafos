/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

import java.util.LinkedList;

/**
 *
 * @author samaniw
 */
public class GrafoN {

    private boolean MatrizAdyacencia[][];
    private LinkedList<Integer> ListaAdyacencia[];

    /**
     * Grafo estático donde se predetermina la cantidad de nodos
     *
     * @param n representa la cantidad total de nodos en la estructura
     */
    public GrafoN(int n) {
        MatrizAdyacencia = new boolean[n][n];
        ListaAdyacencia = new LinkedList[n];

        for (int i = 0; i < n; i++) {
            ListaAdyacencia[i] = new LinkedList<>();
        }
    }

    public void agregarArco(int origen, int destino) {
        MatrizAdyacencia[origen][destino] = true;
        ListaAdyacencia[origen].add(destino);
    }

    public void eliminarArco(int origen, int destino) {
        MatrizAdyacencia[origen][destino] = false;
        ListaAdyacencia[origen].remove(destino);
    }

    public String mostrarMatriz() {
        String tabla = "";
        int tam = MatrizAdyacencia.length;
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                tabla += MatrizAdyacencia[i][j] ? 1 : 0;
            }
            tabla += "\n";
        }
        return tabla;
    }

    public String mostrarListaAdyacencia() {
        String lista = "";
        int tam = ListaAdyacencia.length;
        for (int i = 0; i < tam; i++) {
            lista += i + ": ";
            for (Integer nodo : ListaAdyacencia[i]) {
                lista += nodo + " ";
            }
            lista += "\n";
        }
        return lista;
    }

    public String mostrarArcos() {
        String arcos = "";
        int tam = MatrizAdyacencia.length;
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                if (MatrizAdyacencia[i][j]) {
                    arcos += i + " " + j + "\n";
                }
            }
        }
        return arcos;
    }

    /**
     * BFS
     *
     * @param origen Punto inicial del recorrido
     */
    public void recorridoAnchura(int origen) {
        boolean visitados[] = new boolean[MatrizAdyacencia.length];
        LinkedList<Integer> cola = new LinkedList<>();

        cola.add(origen);
        visitados[origen] = true;

        while (!cola.isEmpty()) {
            origen = cola.remove();
            System.out.print(origen + " ");

            for (Integer vecino : ListaAdyacencia[origen]) {
                if (!visitados[vecino]) {
                    visitados[vecino] = true;
                    cola.add(vecino);
                }
            }
        }

    }

    public void recorridoProfundidad(int origen) {
        boolean visitados[] = new boolean[MatrizAdyacencia.length];
        recorridoProfundidad(origen, visitados);
    }

    private void recorridoProfundidad(int origen, boolean visitados[]) {
        visitados[origen] = true;
        System.out.print(origen + " ");
        for (Integer vecino : ListaAdyacencia[origen]) {
            if (!visitados[vecino]) {
                recorridoProfundidad(vecino, visitados);
            }
        }
    }
    /**
     * Primer punto del taller de grafos.
     * @return Verdadero si todos los nodos tienen la misma cantidad
     * de entradas y salidas
     */
    public boolean validarEntradasSalidas(){
        //TODO
        int c1=0, c2=0, tam=MatrizAdyacencia.length;
        for(int i=0;i<tam;i++)
        {   
            for(int j=0;j<tam;j++)
            {
                c1++;
            }
            for(int j=0;j<tam;j++)
            {
                if(MatrizAdyacencia[j][i])
                {
                    c2++;
                }
            }
            if(!(c1==c2))
            {
                return false;
            }
        }
        return true;
    }
}
