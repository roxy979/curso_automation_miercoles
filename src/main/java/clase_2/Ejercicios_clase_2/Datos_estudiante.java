package clase_2.Ejercicios_clase_2;


import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.Year;


public class Datos_estudiante {
    public static void main(String []args){

        String nombre = "Carlos";
        String apellido = "Dente";
        int edad = 62;
        boolean trabaja = true;
        float promedioDeNotas = 7.98f;
        String fechaDeNacimiento = "05/10/1965";

        System.out.println("Resumen: el alumno " + nombre + ' ' + apellido + ", nacido el " + fechaDeNacimiento + ", de edad " + edad + ", tiene un promedio de "+ promedioDeNotas);

        //uso del local date para manejar fechas
          //LocalDate fechaDeNacimiento2 = LocalDate.of(Year: 1965, Month: 10, MonthDay: 5);
         //System.out.println("Fecha usando localdate: " + fechaDeNacimiento2);
    }

}
