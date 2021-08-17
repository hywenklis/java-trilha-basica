package exercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Elevador {

    private int capacidadeElevador;
    private int totalAndares;
    private int terreo = 0;
    private int andarAtual;
    private int ultimoAndar;
    private List<Pessoa> pessoas = new ArrayList<>(2);

    Scanner scan = new Scanner(System.in);

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public int getCapacidadeElevador() {
        return capacidadeElevador;
    }

    /* Recebe como parêmtro capacidade do elevador e total de andares no prédio,
                os elevadores sempre começa no terreo e vazio.
        */
    public void inicializa(int capacidadeElevador, int totalAndares) {
        this.capacidadeElevador = capacidadeElevador;
        this.totalAndares = totalAndares;

        entra();
        subirEDesce();
    }

    public void entra() {
        // para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
        System.out.println("Apenas 2 pessoas podem entrar no elevador...");
        do {
            System.out.println("Informe seu nome para entrar: ");
            String nome = scan.nextLine();
            pessoas.add(new Pessoa(nome));
        } while (pessoas.size() != getCapacidadeElevador());
        System.out.println(pessoas.size() + " pessoas Entraram! Elevador cheio!");
    }

    public void sai() {
        System.out.print("Informe o nome da pessoa a ser removida: ");
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
            System.out.println("Não existe essa pessoa no elevador");
        }

    }

    public void subirAndar() {
        /*if(andarAtual < totalAndares) {
            System.out.println("Subiu andar!");
            andarAtual++;
        } else {
            System.out.println("Não pode subir ");
        }*/

        while (andarAtual < totalAndares) {
            System.out.println("Subiu andar");
            andarAtual++;
        }
        System.out.println("você chegou no ultimo andar!");

    }

    public void desceAndar() {
        // para descer um andar (não deve descer se já estiver no térreo)
        while (andarAtual != terreo) {
            System.out.println("Desceu o andar!");
            andarAtual--;
        }
        System.out.println("Você está no Térreo");
    }

    public void subirEDesce() {
        System.out.println("Para subir digite [S]: ");
        String subirAndar = scan.nextLine().toUpperCase();
        if (subirAndar.equals("S") && andarAtual != totalAndares) {
            subirAndar();

            do {
                System.out.println("Deseja descer o andar ou sair do elevador");
                String descerAndar = scan.nextLine().toUpperCase();

                if (descerAndar.equals("DESCER")) {
                    desceAndar();


                } if(andarAtual == terreo) {

                    while (pessoas.size() != 0) {
                        System.out.println("Deseja sair? [S] ou [N]");
                        String sair = scan.nextLine().toUpperCase();

                        if(sair.equals("S")) {
                            sai();
                        } else {
                            subirAndar();
                        }
                    }

                } else if (descerAndar.equals("SAIR")) {
                    sai();
                }

            } while (pessoas.size() != 0);
        }

    }
}
