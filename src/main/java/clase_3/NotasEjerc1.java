package clase_3;

public class NotasEjerc1 {
    public static void main(String[] args) {

        int nota = 0;

        if(nota >=1 && nota <=3)
        {
            System.out.println("La nota del examen es: Insuficiente");
        } else if (nota >=4 && nota <=5)
        {
            System.out.println("La nota del examen es: Regular");
        } else if (nota >=6 && nota <=7)
        {
            System.out.println("La nota del examen es: Bien");
        } else if (nota >=8 && nota <=9)
        {
            System.out.println("La nota del examen es: Muy Bien");
        } else if (nota == 10) {
            System.out.println("La nota del examen es: Excelente");
        } else {
            System.out.println("Error al cargar la nota");
        }

    }
}
