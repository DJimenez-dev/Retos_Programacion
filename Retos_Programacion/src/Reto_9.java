public class Reto_9 {
    public static void main(String[] args) {
        int numero = -111;

        boolean comprobacion = isPalindromo(numero);

        if (comprobacion){
            System.out.println("El número es un palindromo");
        }else{
            System.out.println("El número no es palindromo");
        }
    }

    public static boolean isPalindromo(int numero){


        numero = Math.abs(numero);

        String numeroString = Integer.toString(numero);

        String numeroStringReverso = new StringBuilder(numeroString).reverse().toString();

        return numeroString.equals(numeroStringReverso);
    }
}
