/*
Dada una matriz de números enteros nums y un número entero target, devuelva índices de los dos números de manera que sumentarget .

Puede suponer que cada entrada tendría exactamente una solución y no puede utilizar el mismo elemento dos veces.

Puede devolver la respuesta en cualquier orden.
 */



import java.util.ArrayList;

public class Reto_8 {
    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>();
        array.add(2);
        array.add(7);
        array.add(11);
        array.add(15);

        int objetivo = 9;
        int indice1 = 0;
        int indice2 = 0;

        boolean hayObjetivo = false;

        for (int i = 0; i < array.size(); i++) {
            int numeroElegido = array.get(i);
            for (int x = 0; x < array.size(); x++) {
                if (i != x && numeroElegido + array.get(x) == objetivo) {
                    indice1 = i;
                    indice2 = x;
                    hayObjetivo = true;
                    break;
                }
            }
            if (hayObjetivo) {
                break;
            }
        }

        if (hayObjetivo) {
            System.out.println("Índices de los elementos del array que suman " + objetivo + " son: " + indice1 + " y " + indice2);
        } else {
            System.out.println("No se encontró ningún par de elementos que sumen el objetivo.");
        }
    }
}
