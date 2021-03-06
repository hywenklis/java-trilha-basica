package exercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Elevador {

    private int capacidadeElevador;
    private int totalAndares;
    private static final int terreo = 0;
    private int andarAtual;
    private final List<Pessoa> pessoas = new ArrayList<>();

    Scanner scan = new Scanner(System.in);

    public int getCapacidadeElevador() {
        return capacidadeElevador;
    }

    public void inicializa(int capacidadeElevador, int totalAndares) {
        this.capacidadeElevador = capacidadeElevador;
        this.totalAndares = totalAndares;

        System.out.println("------------------ELEVADOR---------------------");
        entra();
        System.out.println("------------------------------------------------");
        operandoElevador();
    }

    public void entra() {

        System.out.println("Apenas 2 pessoas podem entrar no elevador...");
        do {
            System.out.println("Informe seu nome para entrar: ");
            String nome = scan.nextLine();
            pessoas.add(new Pessoa(nome));
        } while (pessoas.size() != getCapacidadeElevador());
        System.out.println(pessoas.size() + " pessoas Entraram! Elevador cheio!");
    }

    public void sai() {
        System.out.print("Informe seu nome para sair: ");
        String nome = scan.nextLine();
        remove(nome);
    }

    public void remove(String nome) {
        Pessoa pessoaASerRemovida = null;
        for (Pessoa pessoa : this.pessoas) {
            if (pessoa.getNome().equals(nome)) {
                pessoaASerRemovida = pessoa;
                break;
            }
        }
        if (pessoaASerRemovida != null) {
            pessoas.remove(pessoaASerRemovida);
            System.out.println(pessoaASerRemovida.getNome() + " Saiu do elevador!");
        } else {
            System.out.println("O nome dessa pessoa não esta na lista do elevador.");
        }

    }

    public void subirAndar() {

        while (andarAtual < totalAndares) {
            System.out.println("Subiu andar");
            andarAtual++;
        }
        System.out.println("você chegou no ultimo andar!");
        System.out.println("--------------------------------");
    }

    public void desceAndar() {

        while (andarAtual != terreo) {
            System.out.println("Desceu o andar!");
            andarAtual--;
        }
        System.out.println("Você está no Térreo");
        System.out.println("--------------------------------");
    }

    public void operandoElevador() {
        System.out.println("Para subir digite [S]: ");
        String subirAndar = scan.nextLine().toUpperCase();
        if (subirAndar.equals("S") && andarAtual != totalAndares) {
            subirAndar();

            do {
                System.out.println("Deseja [DESCER] o andar ou [SAIR] do elevador ?");
                String descerSubirAndar = scan.nextLine().toUpperCase();

                if (descerSubirAndar.equals("DESCER")) {
                    desceAndar();
                }

                if (andarAtual == terreo) {

                    while (!pessoas.isEmpty()) {
                        System.out.println("Deseja sair? [S] ou [N]");
                        String sair = scan.nextLine().toUpperCase();

                        if (sair.equals("S")) {
                            sai();
                        } else if (andarAtual == terreo) {
                            subirAndar();
                        } else {
                            desceAndar();
                        }
                    }

                } else if (descerSubirAndar.equals("SAIR")) {
                    sai();
                }

            } while (!pessoas.isEmpty());
        }
    }
}
