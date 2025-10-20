package clase_3;

public class P5Bucles {
    public static void main(String[]args){

       //while
        int contador = 0;

        while(contador < 5){
            System.out.println("Hola Mundo!While");
            contador++;
        }

        //Do while
        int contador2=0;

        do{
            System.out.println("Hola Do-while");
            contador2++;
        }while(contador2 < 5);

        //for

        for(int i=0;i<5;i++){
            System.out.println("Hola for");
        }
    }
}
