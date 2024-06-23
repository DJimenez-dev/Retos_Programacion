import java.util.Random;
import java.util.Scanner;

public class Reto_4 {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                boolean Upper = false;
                boolean Number = false;
                boolean Symbols = false;
                System.out.println("Introduce la longitud de la contraseña (entre 8 y 16): ");
                int length = sc.nextInt();
                sc.nextLine();
                if(length < 8 || length > 16){
                    System.out.println("Tamaño incorrecto");
                    return;
                }

                System.out.println("¿Mayúsculas? (s/n): ");
                if(sc.nextLine().equals("s")){
                    Upper =true;
                }

                System.out.println("¿Números? (s/n): ");
                if (sc.nextLine().equals("s")){
                    Number = true;
                }

                System.out.println("¿Símbolos? (s/n): ");
                if(sc.nextLine().equals("s")){
                    Symbols = true;
                }

                String password = generatePassword(length, Upper, Number, Symbols);
                System.out.println("Contraseña: " + password);
            }


        public static String generatePassword(int length, boolean Upper, boolean Number, boolean Symbols) {

            String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
            String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String numbers = "0123456789";
            String symbols = "!@#$%^&*()-_=+[]{}|;:'\",.<>?/~`";

            String allCharacters = lowerCaseLetters;

            if (Upper) {
                allCharacters += upperCaseLetters;
            }
            if (Number) {
                allCharacters += numbers;
            }
            if (Symbols) {
                allCharacters += symbols;
            }

            Random random = new Random();
            StringBuilder password = new StringBuilder(length);

            for (int i = 0; i < length; i++) {
                int index = random.nextInt(allCharacters.length());
                password.append(allCharacters.charAt(index));
            }

            return password.toString();
        }
}
