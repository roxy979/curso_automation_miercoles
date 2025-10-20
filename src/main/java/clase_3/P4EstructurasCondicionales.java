package clase_3;

public class P4EstructurasCondicionales {
    public static void main(String[]args){

        int var1 = 100;
        int var2 = 340;

        if(var1 < var2){
            System.out.println("Variable 1 es menor que var2");
        }

        if(var1 > var2){
            System.out.println("va1 es mayor que var2");
        } else {
            System.out.println("var1 no es mayor que var2");
        }

        String Diadelasemana = "Lunes";

        if (Diadelasemana == "Lunes") {
            System.out.println("Hoy es Lunes");
        } else if (Diadelasemana == "Martes") {
            System.out.println("Hoy es Martes");
        }else {
            System.out.println("Este no es mi mundo");
        }

        switch (Diadelasemana){
            case "Lunes":
                System.out.println("Hoy es Lunes");
                break;
            case"Martes":
                    System.out.println("Hoy es martes");
                    break;
            default:
                System.out.println("Este no es mi mundo");


        }
    }
}
