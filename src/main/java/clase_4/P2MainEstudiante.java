package clase_4;
/*Instanciar la clase Estudiante, creada anteriormente, y mostrar sus atributos por pantalla*/
public class P2MainEstudiante {
    public static void main(String[] args) {
        P1Estudiante estudiante = new P1Estudiante();
        P1Estudiante estudiante2 = new P1Estudiante(35, "Rosario Vaca",8.65f);

        System.out.println("ID del estudiante: " + estudiante.getId());
        System.out.println("Nombre del estudiante: " + estudiante.getNombre());
        System.out.println("Promedio del Estudiante: " + estudiante.getPromedio());
        System.out.println("ID del estudiante: " + estudiante2.getId());
        System.out.println("Nombre del estudiante: " + estudiante2.getNombre());
        System.out.println("Promedio del Estudiante: " + estudiante2.getPromedio());

        estudiante2.setPromedio(10.0f);

        System.out.println("ID del estudiante: " + estudiante2.getId());
        System.out.println("Nombre del estudiante: " + estudiante2.getNombre());
        System.out.println("Promedio del Estudiante: " + estudiante2.getPromedio());
    }
}
