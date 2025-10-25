package clase_3.Ejercicios_clase_3;

import java.util.ArrayList;
import java.util.List;

public class Dias_de_la_Semana {
    public static void main(String[] args) {
        List<String> DiasDeLaSemana = new ArrayList<>();

        DiasDeLaSemana.add("Domingo");
        DiasDeLaSemana.add("Lunes");
        DiasDeLaSemana.add("Martes");
        DiasDeLaSemana.add("Miercoles");
        DiasDeLaSemana.add("Jueves");
        DiasDeLaSemana.add("Viernes");
        DiasDeLaSemana.add("Sabado");

        System.out.println("Hoy es dia : ");{
        for (int i = 0; i < DiasDeLaSemana.size(); i++)
                System.out.println(DiasDeLaSemana.get(i));

        }
    }
}

