package clase_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
Ingresar por consola un número mientras sea menor o igual a 500 y
almacenar el número en una lista. Al finalizar el ingreso mostrar los
datos y la cantidad ingresada por pantalla.
También, sí hubo menos de 10 ingresos mostrar “Se ingresaron pocos
números” de los contrario mostrar “Se excedió la cantidad de ingresos
diarios”
 */
public class P7Integrador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        List<Integer>ListaDeNumeros= new ArrayList<>();
        int contador = 0;
        do {
            System.out.println("Ingrese el numero: ");
            numero = scanner.nextInt();
            ListaDeNumeros.add(numero);
            contador++;
        }while (numero <=500);
        System.out.println("Datos ingresados: " + ListaDeNumeros);

        if(ListaDeNumeros.size() <10){
            System.out.println("S" +
                    "Se ingresaron pocos números");

        }else
            System.out.println("Se excedió la cantidad de ingresos" +
                    "" +
                    "diarios");
    }
}

