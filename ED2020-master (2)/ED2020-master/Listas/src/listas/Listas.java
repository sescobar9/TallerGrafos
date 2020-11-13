/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import java.util.ArrayList;

/**
 *
 * @author samaniw
 */
public class Listas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ListaDoble quiz = new ListaDoble();
        quiz.add(11);
        quiz.add(22);
        quiz.add(33);
        quiz.add(11);
        quiz.add(22);
        quiz.add(44);
        System.out.println("Datos del quiz: " +quiz.showData());
        quiz.deleteDuplicate();
        System.out.println("Datos del quiz: " +quiz.showData());
        
        PilaDoble tronex =  new PilaDoble(6);
        tronex.agregarDatoPila1(77);
        tronex.agregarDatoPila1(88);
        tronex.agregarDatoPila2(11);
        tronex.agregarDatoPila2(22);
        tronex.agregarDatoPila2(33);
        tronex.agregarDatoPila2(44);
        tronex.agregarDatoPila2(55);
        System.out.println("");
        
        try {
            System.out.println("Conversion numéria:" + convertirBasesNumericas(101, 7));
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }

        //ejemplos de recursividad
        Recursividad ejemploR = new Recursividad();
        System.out.println("Ejemplo de sumatoria: " + ejemploR.sumatoria(5));
        System.out.println("Ejemplo de factorial: " + ejemploR.factorial(6));
        System.out.println("Ejemplo de serie fibonacci: " + ejemploR.fibonacci(9));
        System.out.print("Ejemplo de datos de la serie de F: ");
        ejemploR.serieFibonacci(9);

        //System.out.println("\nValidar expresion matemática 1: " + validarExpresionMatematica("{[(5+7)/3]-66}"));//resultado: verdadero
        System.out.println("Validar expresion matemática 2 : " + validarExpresionMatematica("{[(5+7)/3]-66}"));//resultado: falso

        try {
            System.out.println("Conversión numérica 1: " + convertirBasesNumericas(14, 8));//resultado: 16
            //System.out.println("Conversión numérica 2: " + convertirBasesNumericas(14, 7));//mostrar el error
            System.out.println("Conversión numérica 3: " + convertirBasesNumericas(171, 16));//E
            System.out.println("Conversión numérica 4: " + convertirBasesNumericas(14, 2));//1110

        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }

        ColaEnlazada atencionCiudadana = new ColaEnlazada();
        atencionCiudadana.agregar(11);
        atencionCiudadana.agregar(22);
        atencionCiudadana.agregar(33);
        atencionCiudadana.agregar(55);
        atencionCiudadana.agregar(77);
        atencionCiudadana.agregar(999);
        System.out.println("");
        atencionCiudadana.remover();
        System.out.println("");
        String conversion = convetirDecimalBinario(100);
        System.out.println("Conversion de decimal a binario: " + conversion);

//        int a = 4, b = 8;
        //condicional en cortocircuito
        //https://es.wikipedia.org/wiki/Evaluaci%C3%B3n_de_cortocircuito
//        if (a > 0 || b > 0) {
//
//        }
//        if (a > 0 | b > 0) {
//
//        }
//        System.out.println("Validar parentesis");
//        System.out.println(validarBalanceParentesis("(()(()())())"));
//        
//        
//        // TODO code application logic here
//        LinkedStack<Double> pilaEnlazada = new LinkedStack<>();
//        pilaEnlazada.push(3.3);
//        pilaEnlazada.push(4.4);
//        pilaEnlazada.push(5.5);
//        pilaEnlazada.push(6.6);
//        try {
//            System.out.println("Mostrar el siguiente en salir:" + pilaEnlazada.peek());
//            pilaEnlazada.pop();
//            pilaEnlazada.pop();
//            pilaEnlazada.pop();
//            pilaEnlazada.pop();
//            pilaEnlazada.pop();
//            pilaEnlazada.pop();
//            pilaEnlazada.pop();
//            pilaEnlazada.pop();
//            System.out.println("Mostrar el siguiente en salir:" + pilaEnlazada.peek());
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//
//        ArrayStack<Integer> pilaArreglo = new ArrayStack<>(3);
//        pilaArreglo.push(11);
//        pilaArreglo.push(22);
//        pilaArreglo.push(33);
//        try {
//            System.out.println("Antes de hacer pop");
//            System.out.println(pilaArreglo.peek());
//            pilaArreglo.pop();
//            pilaArreglo.pop();
//            pilaArreglo.pop();
//            pilaArreglo.pop();
//            System.out.println("Despues de hacer pop");
//            System.out.println(pilaArreglo.peek());
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        System.out.println("");
        ListaCircularDoble lista4 = new ListaCircularDoble();
        lista4.addOrdered(55);
        lista4.addOrdered(33);
        lista4.addOrdered(66);
        lista4.addOrdered(22);
        lista4.addOrdered(44);
//        lista4.add(55);
//        lista4.add(66);
//        lista4.add(77);
//        lista4.add(88);
//        lista4.add(99);
        System.out.println("Datos ascendentes: " + lista4.showDataAsc());
//        System.out.println("Datos descendentes: " + lista4.showDataDesc());
//        lista4.deleteLast();
//        System.out.println("");
//
//        System.out.println("Listado circular doble: " + lista4.showDataAsc());
//        System.out.println("--------------");
//        ListaCircularSimple lista3 = new ListaCircularSimple();
//        lista3.add(55);
//        lista3.add(66);
//        lista3.add(77);
//
//        ListaCircularSimple lista5 = new ListaCircularSimple();
//        lista5.add(88);
//        lista5.add(99);
//        lista5.add(101);
//        //lista 3
//        System.out.println(lista3.showData());
//        //lista 5
//        System.out.println(lista5.showData());
//        System.out.println("Union de listas");
//        lista5.unir(lista3);
//        //comprobar la union de listas
//        System.out.println(lista5.showData());
//
//        ListaDoble lista2 = new ListaDoble();
//        lista2.addLast(55);
//        lista2.addLast(66);
//        lista2.addLast(77);
//        lista2.addLast(88);
//        lista2.addLast(99);
//        System.out.println("Datos de la lista doble:" + lista2.showData());
//        lista2.deleteLast();
//        System.out.println("Datos de la lista doble:" + lista2.showData());
////        lista2.add(55);
////        lista2.add(66);
////        lista2.add(77);
////        lista2.add(88);
////        lista2.add(33);
//        System.out.println("Datos de la lista doble asc: " + lista2.showData());
//        System.out.println("Datos de la lista doble desc: " + lista2.showDataDesc());
//
//        lista2.delete();
//
//        lista2.delete();
//        System.out.println("Datos de la lista doble: " + lista2.showData());
//
////        ArrayList<String> data = new ArrayList<>();
////        ArrayList<Integer> edades = new ArrayList<>();
////        ArrayList<Double> notas = new ArrayList<>();
////        ArrayList<Node> misNodos = new ArrayList<>();
//        miLista listica = new miLista();
//        listica.addLast(44);
//        listica.addLast(55);
//        listica.addLast(66);
//        listica.addLast(77);
//        listica.addLast(99);
////        listica.add(55);
////        listica.add(33);
////        listica.addOrdered(11);
////        listica.delete();
////        listica.addOrdered(88);
//        System.out.println("Datos de lista simple: " + listica.showData());
//        System.out.println("total de datos:" + listica.TotalDatos());
//        System.out.println("Valor minimo:" + listica.Menor());
////       listica.add(66);
////       listica.add(77);
////       listica.add(88);
////       listica.add(99);
////       listica.add(101);
////       listica.add(111);
////       listica.add(121);
////       listica.add(131);
////       listica.add(8);
////        listica.addOrdered(11);
////        listica.addOrdered(8);
////        listica.addOrdered(6);
////        listica.addOrdered(13);
////        listica.addOrdered(9);
////
////        System.out.println(listica.showData());
////        listica.delete();
////        listica.delete();
////        listica.delete();
////        listica.delete();
////        listica.delete();
////        listica.delete();
////        listica.delete();
////        listica.delete();
////        System.out.println("");
////
////        System.out.println(listica.showData());
    }

    public static String convetirDecimalBinario(int n) {
        LinkedStack<Integer> residuos = new LinkedStack<>();
        String binario = "";
        while (n > 0) {
            residuos.push(n % 2);
            n /= 2;
        }
        while (!residuos.empty()) {
            try {
                binario += residuos.pop();
            } catch (Exception e) {
                System.out.println("Error interno");
            }

        }
        return binario;

    }

    public static boolean validarBalanceParentesis(String expresion) {
        LinkedStack<String> parentesis = new LinkedStack<>();
        char[] expresionEnArreglo = expresion.toCharArray();
        for (int i = 0; i < expresionEnArreglo.length; i++) {
            if (expresionEnArreglo[i] == '(') {
                parentesis.push("(");
            } else if (expresionEnArreglo[i] == ')') {
                if (parentesis.empty()) {
                    return false;
                } else {
                    try {
                        parentesis.pop();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                }

            }

        }

        return parentesis.empty();

    }

    /**
     * Verificar si una expresión matemática que utilice llaves, corchetes y
     * paréntesis se encuentra balanceada
     *
     * @param expresion Expresion matemática
     * @return Verdadero si esta balanceada, falso si no esta balanceada
     * Expresión balanceada: {[(5+7)/3]-66} Expresión No balanceada:
     * {([5+7]/3)-66
     */
    public static boolean validarExpresionMatematica(String expresion) {
        //Usar pilas para almacenar información...
        LinkedStack<String> parentesis = new LinkedStack<>();
        boolean llaveB = false, corcheteB = false, parentesisB = false;
        char[] expresionEnArreglo = expresion.toCharArray();
        for (int i = 0; i < expresionEnArreglo.length; i++) {
            System.out.println("");
//({[5+7]/3)-66}
            if (expresionEnArreglo[i] == '{' && !corcheteB && !parentesisB) {
                if (!llaveB) {
                    llaveB = true;
                    parentesis.push("{");

                } else {
                    return false;
                }

            } else if (expresionEnArreglo[i] == '[' && !llaveB && !parentesisB) {
                if (!corcheteB) {
                    corcheteB = true;
                    parentesis.push("[");
                } else {
                    return false;
                }
            } else if (expresionEnArreglo[i] == '(' && !corcheteB && !llaveB) {
                if (!parentesisB) {
                    parentesisB = true;
                    parentesis.push("(");
                } else {
                    return false;
                }

            } else if (expresionEnArreglo[i] == ')') {
                try {
                    parentesis.pop();
                    parentesisB = false;
                } catch (Exception e) {
                    return false;
                }

            } else if (expresionEnArreglo[i] == ']') {
                try {
                    parentesis.pop();
                    corcheteB = false;
                } catch (Exception e) {
                    return false;
                }
            } else if (expresionEnArreglo[i] == '}') {
                try {
                    parentesis.pop();
                    llaveB = false;
                } catch (Exception e) {
                    return false;
                }
            }

        }

        return parentesis.empty();
    }

    public static String convertirBasesNumericas(int n, int base) throws Exception {
        if (base != 2 && base != 8 && base != 16) {
            throw new IllegalArgumentException("La base no es válida");
        } else {
            LinkedStack<Integer> residuos = new LinkedStack<>();
            String resultado = "";
            while (n > 0) {
                residuos.push(n % base);
                n /= base;
            }
            while (!residuos.empty()) {
                try {
                    Object temp;
                    if (base == 16) {
                        temp = residuos.pop();
                        switch (temp.toString()) {
                            case "10":
                                resultado += "A";
                                break;
                            case "11":
                                resultado += "B";
                                break;
                            case "12":
                                resultado += "C";
                                break;
                            case "13":
                                resultado += "D";
                                break;
                            case "14":
                                resultado += "E";
                                break;
                            case "15":
                                resultado += "F";
                                break;
                            default:
                                resultado += temp;
                        }

                    } else {
                        resultado += residuos.pop();
                    }

                } catch (Exception e) {
                    System.out.println("Error interno");
                }

            }
            return resultado;

            /*
            if(base no es correcta){
                throw new IllegalArgumentException("La base no válida");
            }else{
                realizar conversión
            }
             */
        }
    }

}
