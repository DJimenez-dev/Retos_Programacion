import java.util.Scanner;

public class Reto_5 {
    public static void main(String[] args) {
        //5n^2 + 4 || 5n^2 - 4 Luego hacer sqrt del resultado y comprobar que si multiplicando es raiz por si misma da n

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número y te diremos si es primo, de fibonacci, y par o impar: ");

        int numero_Introducido = sc.nextInt();

        isPrimo(numero_Introducido);
        isFibonacci(numero_Introducido);
        isPar(numero_Introducido);
    }


    private static boolean cuadradoPerfecto(int numero){
        int n = (int) Math.sqrt(numero);
        return (n * n == numero);
    }

    private static void isFibonacci(int numero){
        if(cuadradoPerfecto(5*numero*numero + 4) || cuadradoPerfecto((5 * numero * numero -4))){
            System.out.println("Si es número Fibonacci");
        }else{
            System.out.println("No es número de Fibonacci");
        }
    }

    public static void isPrimo(int numero){
        int contador = 0;
        for(int x = 1; x <= numero; x++){
            if(numero % x == 0){
                contador++;
            }
        }
        if(contador == 2){
            System.out.println("Es múmero primo");
        }else{
            System.out.println("No es número primo");
        }
    }

    public static void isPar(int numero){
        if (numero % 2 == 0){
            System.out.println("Es par");
        }else {
            System.out.println("Es impar");
        }
    }
}
