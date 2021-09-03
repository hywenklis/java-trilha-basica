package br.com.alura.tdd.service;

import br.com.alura.tdd.Service.ReajusteService;
import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReajusteServiceTest {

    private ReajusteService service;
    private Funcionario funcionario;

    @BeforeEach
    public void inicializa() {

        System.out.println("Inicio");

        this.service = new ReajusteService();
        this.funcionario = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000.00"));
    }

    @AfterEach
    public void fim() {
        System.out.println("Fim");
    }

    @BeforeAll
    public static void antesDeTodos() {
        System.out.println("Antes de todos");
    }

    @AfterAll
    public static void depoisDeTodos() {
        System.out.println("Depois de todos");
    }

    @Test
    @DisplayName("Reajuste deveria ser de 3% quando o desempenho for a desejar")
    public void reajusteDesejar() {
        service.concederReajuste(funcionario, Desempenho.A_DESEJAR);

        assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }

    @Test
    @DisplayName("Reajuste deveria ser de 15% quando o desempenho for a bom")
    public void reajusteBom() {
        service.concederReajuste(funcionario, Desempenho.BOM);

        assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
    }

    @Test
    @DisplayName("Reajuste deveria ser de 3% quando o desempenho for a desejar")
    public void reajusteOtimo() {
        service.concederReajuste(funcionario, Desempenho.OTIMO);

        assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
    }
}
