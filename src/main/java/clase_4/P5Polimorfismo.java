package clase_4;
/*Siguiendo la Práctica 4, agregar una clase NoDocente que herede de Persona.
Agregar en Persona el método saludar() que imprima “Hola, soy una persona?”.
Sobreescribir saludar() en cada clase hija:
Alumno debe imprimir “Hola, soy un alumno”
Profesor debe imprimir “Hola, soy un profesor”
NoDocente debe imprimir “Hola, soy un no docente”
En Profesor se debe implementar un método calificar() sobrecargado
Si calificar recibe una nota, se debe mostrar “La nota del curso es: <nota>”
Si calificar solo una nota y un Alumno, se debe mostrar “La nota del alumno <nombre> es:
<nota>”*/
public class P5Polimorfismo {
    public static void main(String[] args) {

        Alumno alumno = new Alumno("Martin" ,"Miguel", "4420",8.68f);
        Profesor profesor = new Profesor("Juarez","Andrea","Algebra");
        NoDocente nd = new NoDocente("Cente","Nodo");

        printer(alumno);
        printer(profesor);
        printer(nd);
    }

    public static void printer(Persona persona){
        persona.saludar();


    }
}
