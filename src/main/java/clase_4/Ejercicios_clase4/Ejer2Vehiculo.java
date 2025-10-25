package clase_4.Ejercicios_clase4;
/*Se requiere crear la clase Vehiculo con los siguientes atributos:
- marca (string)
- modelo (string)
- anio (int)
Y además agregar el constructor (con todos los parámetros) y los métodos getters & setters.
En otro archivo que contenga al método main, instanciar dos objetos de la clase Vehiculo
y mostrar por pantalla la información de cada uno.
 */

public class Ejer2Vehiculo {
    private String marca;
    private String modelo;
    private int anio;

    public Ejer2Vehiculo(){
        this.marca = "Audi";
        this.modelo = "Perseo";
        this.anio = 2026;
    }
    public Ejer2Vehiculo(String marca, String modelo, int anio){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
