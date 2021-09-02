import java.time.*;
import java.time.format.DateTimeFormatter;

public class Datas {

    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate olimpiadasRio = LocalDate.of(2023, Month.JUNE, 5);
//        int anoRestante = olimpiadasRio.getYear() - hoje.getYear();
//        System.out.println(anoRestante);

        LocalDate proximaOlimpiada = olimpiadasRio.plusYears(7);
        System.out.println(proximaOlimpiada);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String valorFormatado = proximaOlimpiada.format(formatter);
        System.out.println(valorFormatado);

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");

        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora.format(timeFormatter));

        LocalTime intervalo = LocalTime.of(15,30);
        System.out.println(intervalo);
    }
}
