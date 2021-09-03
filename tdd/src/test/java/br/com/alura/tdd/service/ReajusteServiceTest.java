package br.com.alura.tdd.service;

import br.com.alura.tdd.Service.ReajusteService;
import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReajusteServiceTest {

    @Test
    @DisplayName("Reajuste deveria ser de 3% quando o desempenho for a desejar")
    public void reajusteDesejar() {
        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000.00"));

        service.concederReajuste(funcionario, Desempenho.A_DESEJAR);

        assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }

    @Test
    @DisplayName("Reajuste deveria ser de 15% quando o desempenho for a bom")
    public void reajusteBom() {
        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000.00"));

        service.concederReajuste(funcionario, Desempenho.BOM);

        assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
    }

    @Test
    @DisplayName("Reajuste deveria ser de 3% quando o desempenho for a desejar")
    public void reajusteOtimo() {
        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000.00"));

        service.concederReajuste(funcionario, Desempenho.OTIMO);

        assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
    }
}
