package clase_4;
/*Crear la clase Estudiante que tiene como atributos el id (int), nombre completo (string)
y promedio (float). Además, agregar el constructor vacío, el constructor con todos los
parámetros (“completo”) y los métodos getters & setters.*/
public class P1Estudiante {
    private int id;
    private String nombre;
    private float promedio;

    public P1Estudiante(){
        this.id = 1;
        this.nombre= "Marcos Jara";
        this.promedio = 5;

    }
    public P1Estudiante(int id, String nombre, float promedio){
        this.id = id;
        this.nombre = nombre;
        this.promedio = promedio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }
}
