/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

/**
 *
 * @author samaniw
 */
public class NodoPeso implements Comparable<NodoPeso> {
    
    private String nodo;
    private int peso;


    public NodoPeso(String nodo, int peso) {
        this.nodo = nodo;
        this.peso = peso;
    }

    @Override
    public int compareTo(NodoPeso o) {
        if(this.getPeso()==o.getPeso()){
            return 0;
        }else if(this.getPeso()<o.getPeso()){
            return -1;
        }else{
            return 1;
        }
    }

    /**
     * @return the nodo
     */
    public String getNodo() {
        return nodo;
    }

    /**
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }
    
    
}
