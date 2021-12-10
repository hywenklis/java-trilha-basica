package mensagem;

import java.time.LocalDateTime;

public class MensagemBoasVindas {
    public static void main(String[] args) {
        int hora = LocalDateTime.now().getHour();

        if (hora >= 5 && hora <= 12) {
            System.out.println("Bom dia!");
        } else if (hora >= 13 && hora <=18) {
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Boa noite!");
        }
    }
}
