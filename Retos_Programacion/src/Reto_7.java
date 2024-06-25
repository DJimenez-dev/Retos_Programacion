import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Reto_7 {
    public static void main(String[] args) {
        adivinanza();
    }

    public static void adivinanza(){

        Scanner sc = new Scanner(System.in);

        ArrayList<String> palabras = new ArrayList<>();
        palabras.add("percebe");
        palabras.add("elden");
        palabras.add("ring");
        palabras.add("jiujitsu");
        palabras.add("baloncesto");
        palabras.add("videojuego");
        palabras.add("microprocesadot");
        palabras.add("github");


        ArrayList<Double> probabilidad = new ArrayList<>();
        probabilidad.add(0.1);
        probabilidad.add(0.2);
        probabilidad.add(0.3);
        probabilidad.add(0.4);
        probabilidad.add(0.5);
        probabilidad.add(0.6);

        int intentos = 3;

        Random random = new Random();
        int palabraAleatoria = random.nextInt(palabras.size());

        String palabra = palabras.get(palabraAleatoria);

        double probabilidadAleatoria = random.nextDouble(probabilidad.size());

        char[] palabraOculta = ocultarLetras(palabra, probabilidadAleatoria, random);

        while(intentos > 0){
            System.out.println("Palabra otorgada: " + new String(palabraOculta));
            System.out.println("Intentos para adivinar la palabra: " + intentos);
            System.out.println("Introduce una letra: ");
            String teclado = sc.nextLine();

            if(teclado.length() == 1){
                char letra = teclado.charAt(0);
                boolean acierto = false;
                for (int x = 0; x < palabra.length(); x++){
                    if (palabra.charAt(x) == letra && new String(palabraOculta).charAt(x) == '_'){
                        palabraOculta[x] = letra;
                        acierto = true;
                    }
                }

                if(acierto != true){
                    intentos--;
                }
            }else{
                System.out.println("Error de caracteres");
            }

            if (new String(palabraOculta).equals(palabra)){
                System.out.println("Felicidades, has adivinado la palabra: " + palabra);
                break;
            }

            if (intentos == 0) {
                System.out.println("Has perdido el juego, la palabra correcta era: " + palabra);
            }
        }
    }

    private static char[] ocultarLetras(String palabra, double probabilidad, Random random) {
        char[] resultado = palabra.toCharArray();

        for (int i = 0; i < palabra.length(); i++) {
            if (random.nextDouble() < 0.6) {
                resultado[i] = '_';
            }
        }

        return resultado;
    }
}
