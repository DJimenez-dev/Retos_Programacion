import java.time.DayOfWeek;
import java.time.LocalDate;

public class Reto_6 {

    public static void main(String[] args) {
        boolean viernes13 = isViernes13(11,2023);
        System.out.println("Viernes 13 = " + viernes13);
    }

    public static boolean isViernes13(int mes, int año){

        LocalDate fecha = LocalDate.of(año,mes,13);

        return fecha.getDayOfWeek() == DayOfWeek.FRIDAY;
    }
}