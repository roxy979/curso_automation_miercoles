package clase_3.Ejercicios_clase_3;

import java.util.ArrayList;
import java.util.List;

public class Lista_de_materias {
    public static void main(String[] args) {
        List<String> materias = new ArrayList<>();

        materias.add("Probabilidad y Estadistica");
        materias.add("Fisica 1");
        materias.add("Analisis matematico");
        materias.add("Matematicas");

        System.out.println("Materias por rendir: " + materias);
        materias.remove("Matematicas");
        System.out.println("Materias por rendir: " + materias);


    }
}
