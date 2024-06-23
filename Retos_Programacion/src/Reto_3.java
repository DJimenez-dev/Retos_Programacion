import java.util.Scanner;

public class Reto_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la secuencia de puntos ganados por P1 y P2 (ej. P1 P1 P2 P2 P1 P2 P1 P1):");
        String input = sc.nextLine();

        String[] points = input.split(" ");

        int P1score = 0;
        int P2score = 0;

        for(String point : points){
            if (point.equals("P1")){
                P1score++;
            } else if (point.equals("P2")) {
                P2score++;
            }else {
                System.out.println("Error con parámetro " + point);
                return;
            }

            String marcador = getScore(P1score,P2score);
            System.out.println(marcador);
            if(marcador.equals("Ha ganado P1") || marcador.equals("Ha ganado P2")){
                break;
            }
        }


    }

    public static String getScore(int P1score, int P2score){
        if (P1score >= 3 && P2score >= 3){
            if (P1score == P2score){
                return "Deuce";
            } else if (P1score -1 == P2score) {
                return "Ventaja P1";
            } else if (P1score == P2score - 1) {
                return "Ventaja P2";
            } else if (P1score -2 == P2score) {
                return "Ha ganado P1";
            } else if (P1score == P2score - 2) {
                return "Ha ganado P2";
            }
        } else if (P1score > 4) {
            return "Ha ganado P1";
        } else if (P2score > 4) {
            return "Ha ganado P2";
        }

        return translateScore(P1score) + " - " + translateScore(P2score);
    }

    public static String translateScore(int score){
        switch (score) {
            case 0:
                return "Love";
            case 1:
                return "15";
            case 2:
                return "30";
            case 3:
                return "40";
            default:
                return  "";

        }
    }
}
