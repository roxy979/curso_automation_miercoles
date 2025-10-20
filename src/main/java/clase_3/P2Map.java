package clase_3;

import java.util.HashMap;
import java.util.Map;

public class P2Map {
    public static void main(String[] args){
        Map<String,Integer> mapaDeNombreYEdad = new HashMap<>();

        mapaDeNombreYEdad.put("Maria",79);
        mapaDeNombreYEdad.put("Angelica",70);

        System.out.println("Valores del mapa" + mapaDeNombreYEdad);
        System.out.println("Edad de Angelica: " + mapaDeNombreYEdad.get("Angelica"));
    }
}
