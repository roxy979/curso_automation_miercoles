package clase_4.Ejercicios_clase4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*En otro archivo que contenga al método main, instanciar tres objetos de la clase Curso ingresando
los datos por consola. Luego de finalizar el ingreso, mostrar por pantalla la información de cada
 uno.*/
public class Ejer3MainCurso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Ejer3Curso> cursos = new ArrayList<>();

        for(int i=0;i<3;i++){
            System.out.println("Ingrese nombre del curso: " );
            String nombre = scanner.nextLine();

            System.out.println("Ingrese duracion: ");
            var duracion = scanner.nextInt();scanner.nextLine();

            Ejer3Curso curso = new Ejer3Curso(nombre, duracion);
            cursos.add(curso);

        }
        System.out.println("Informacion de cursos: " + cursos);

}
}
