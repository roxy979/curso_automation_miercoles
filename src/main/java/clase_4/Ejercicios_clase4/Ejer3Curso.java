package clase_4.Ejercicios_clase4;
/*Se requiere crear la clase Curso con los siguientes atributos:
- nombre (string)
- duracion (int)
Agregar el constructor (con todos los parámetros) y los métodos getters & setters.
En otro archivo que contenga al método main, instanciar tres objetos de la clase Curso ingresando
los datos por consola. Luego de finalizar el ingreso, mostrar por pantalla la información de cada
 uno.
 */
public class Ejer3Curso {
    private String nombre;
    private int duracion;

    public Ejer3Curso(String nombre, int duracion){
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;

    }
    @Override
    public String toString() {
        return "{Nombre: " + getNombre() +
                " - Duracion: " + getDuracion() + "}";
    }
}
