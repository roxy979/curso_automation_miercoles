package clase_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P1arraysYListas {
    public static void main (String[]args){
        //arrays
        int[] arraysDeNumeros = new int[3];
        arraysDeNumeros[0] = 42;
        arraysDeNumeros[1] = 60;
        arraysDeNumeros[2] = 23;

        System.out.println("Valor de la posicion del array 0: " + arraysDeNumeros [0]);
        System.out.println("Valor de la posicion del array 1: " + arraysDeNumeros [1]);
        System.out.println("Valor de la posicion del array 2: " + arraysDeNumeros [2]);
        //para imprimir todos los array en una linea

        System.out.println("Valores del array: " + Arrays.toString(arraysDeNumeros));
        //LISTAS
        //******************

        List<String> listaDeNombres = new ArrayList<>();

        listaDeNombres.add("Jose");//posicion 0
        listaDeNombres.add("Aldo");//posicion 1
        listaDeNombres.add("Maria");//posicion 2

        //System.out.println("Elementos de la lista: " + listaDeNombres);

        //para mostrar elelemengto en la posicion
        System.out.println("El elemento en la posicion 0 es : " + listaDeNombres.get(0));
        //para remover por nombre
       // listaDeNombres.remove(2);
        //para remover por posicion
        //listaDeNombres.remove(2);

        System.out.println("Elementos despues de eliminar" + listaDeNombres);


    }
}
