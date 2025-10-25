package clase_4.Ejercicios_clase4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*Se requiere cargar las 10 notas de un alumno para calcular el promedio.
Es necesario cargar las notas usando la consola y al finalizar mostrar en
pantalla el promedio de todas las notas.
Tip: usar la clase Scanner para el ingreso por consola, y el bucle for para iterar.
 Tip: usar una lista para almacenar las notas.
*/
public class Ejer1PromedioDeNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int notas = 0;
        List<Integer> PromedioNotas = new ArrayList<>();


        for(int i=0; i<10;i++) {
            System.out.println("Ingrese la nota: ");
            notas = scanner.nextInt();
            PromedioNotas.add(notas);

        }
        System.out.println("Notas del alumno: "+ PromedioNotas );

        var promedio = 0;
        for (int nota : PromedioNotas) {
            promedio += nota;
        }

        System.out.println("El promedio de notas es: " + promedio/PromedioNotas.size());
    }
}


