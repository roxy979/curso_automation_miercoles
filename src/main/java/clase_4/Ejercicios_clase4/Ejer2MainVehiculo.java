package clase_4.Ejercicios_clase4;

public class Ejer2MainVehiculo {
    public static void main(String[] args) {
        Ejer2Vehiculo auto= new Ejer2Vehiculo();
        Ejer2Vehiculo auto2= new Ejer2Vehiculo("Mazda", "Infinitive",2027);

        System.out.println("Marca del vehiculo: " + auto.getMarca());
        System.out.println("Modelo del vehiculo: " + auto.getModelo());
        System.out.println("Año del vehiculo: " + auto.getAnio());
        System.out.println("Marca del vehiculo: " + auto2.getMarca());
        System.out.println("Modelo del vehiculo: " + auto2.getModelo());
        System.out.println("Año del vehiculo: " + auto2.getAnio());
    }
}
