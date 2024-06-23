import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * Escribe un programa que reciba un texto y transforme lenguaje natural a
 * "lenguaje hacker" (conocido realmente como "leet" o "1337"). Este lenguaje
 *  se caracteriza por sustituir caracteres alfanuméricos.
 * - Utiliza esta tabla (https://www.gamehouse.com/blog/leet-speak-cheat-sheet/)
 *   con el alfabeto y los números en "leet".
 *   (Usa la primera opción de cada transformación. Por ejemplo "4" para la "a")
 */
public class Reto_2 {
    public static void main(String[] args) {

        HashMap<Character,String> mapa = new HashMap<>();
        String fraseTrasncrita = "";
        mapa.put('A',"4");
        mapa.put('B',"I3");
        mapa.put('C',"[");
        mapa.put('D',")");
        mapa.put('E',"3");
        mapa.put('F',"|=");
        mapa.put('G',"&");
        mapa.put('H',"#");
        mapa.put('I',"1");
        mapa.put('J',",_|");
        mapa.put('K',">|");
        mapa.put('L',"1");
        mapa.put('M',"/\\/\\");
        mapa.put('N',"^/");
        mapa.put('O',"0");
        mapa.put('P',"|*");
        mapa.put('Q',"(_,)");
        mapa.put('R',"I2");
        mapa.put('S',"5");
        mapa.put('T',"7");
        mapa.put('U',"(_)");
        mapa.put('V',"\\/");
        mapa.put('W',"\\/\\/\\");
        mapa.put('X',"><");
        mapa.put('Y',"j");
        mapa.put('Z',"2");
        mapa.put(' '," ");


        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una frase a transcribir a lenguaje hacker: ");
        String frase = sc.nextLine();
        String frase_Mayusculas = frase.toUpperCase();

        for(int i = 0; i < frase_Mayusculas.length(); i++){
            if(mapa.containsKey(frase_Mayusculas.charAt(i))){
                fraseTrasncrita += mapa.get(frase_Mayusculas.charAt(i));
            }
        }
        System.out.println(fraseTrasncrita);


    }
}
