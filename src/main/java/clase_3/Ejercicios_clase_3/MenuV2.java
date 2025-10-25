package clase_3.Ejercicios_clase_3;

public class MenuV2 {
    public static void main(String[] args) {

        int opcion = 1;

        switch (opcion){
            case 1:
                System.out.println("Usted eligio la opcion 1 (Hamburguesas con papas fritas), desea confirmar su orden??");
                break;
            case 2:
                System.out.println("Usted eligio la opcion 2 (Guiso de lentejas), desea confirmar su orden??");
                break;
            case 3:
                System.out.println("Usted eligio la opcion 3 (24 piezas de Sushi), desea confirmar su orden??");
                break;
            case 4:
                System.out.println("Usted eligio la opcion 4 (Pizza de jamon y morron), desea confirmar su orden??");
                break;
            case 5:
                System.out.println("Usted eligio la opcion 5 (Empanadas de carne), desea confirmar su orden??");
                break;
            default:
                System.out.println("Opcion ingresada inexistente");

        }
    }
}

