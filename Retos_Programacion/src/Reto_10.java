import java.util.ArrayList;
import java.util.HashMap;

public class Reto_10 {
    public static void main(String[] args) {

        HashMap<String,Integer> mapa = new HashMap<>();
        mapa.put("I",1);
        mapa.put("V",5);
        mapa.put("X",10);
        mapa.put("L",50);
        mapa.put("C",100);
        mapa.put("D",500);
        mapa.put("M",1000);

        String numero_Romano = "MCMXCIV";
        int resultado = 0;

        for(int x = 0; x < numero_Romano.length()-1; x++){
            int actual = mapa.get(String.valueOf(numero_Romano.charAt(x)));
            int siguiente = mapa.get(String.valueOf(numero_Romano.charAt(x+1)));

            if(actual < siguiente){
                resultado -= actual;
            }else {
                resultado += actual;
            }
        }

        resultado += mapa.get(String.valueOf(numero_Romano.charAt(numero_Romano.length()-1)));
        //Hago esto debido a que salgo del bucle antes de interactuar con la última letra de la cadena
        //En cualquier caso, si es una operación que sume o reste lo trato gracias al if-else ya que
        //compruebo si el último número de la cadena es mayor que el penúltimo. Si lo es, resto el penúltimo
        //número y luego fuera del "for" ya sumo el último número restante.

        System.out.println("Numero Romano: " + numero_Romano);
        System.out.println("Numero Decimal: " + resultado);
    }
}
