package exercicio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private  List<Pessoa> pessoas = new ArrayList<>();
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public List<Pessoa> getPessoas() {
        return this.pessoas;
    }

    public void adicionarPessoa(String nome, int idade, float altura) {
        pessoas.add(new Pessoa(nome, idade, altura));
        System.out.println("Pessoa adicionada");
    }

    public Pessoa pessoa(int indice) {
        return this.pessoas.get(indice);
    }


    public void remover(String nome) {
        Pessoa pessoaASerRemovida = null;
        for (Pessoa pessoa : this.pessoas) {
            if (pessoa.getNome().equals(nome)) {
                pessoaASerRemovida = pessoa;
                break;
            }
        }

        if (pessoaASerRemovida != null) {
            this.pessoas.remove(pessoaASerRemovida);
        }
        System.out.println(pessoaASerRemovida.getNome() + " Removido da lista");
    }
    public void criarPessoa() throws IOException {
        System.out.print("Informe o nome: ");
        String nome = br.readLine();
        System.out.print("Informe o ano de nascimento: ");
        int anonasc = Integer.parseInt(br.readLine());
        System.out.print("Informe a altura: ");
        float altura = Float.parseFloat(br.readLine());
        adicionarPessoa(nome, anonasc, altura);
    }

    public void listarPessoasCadastradas() {
        for (Pessoa pessoa : getPessoas()) {
            System.out.println(pessoa.toString());
        }
    }

    public void imprimirPessoaPeloIndice() throws IOException {

        System.out.print("Informe o índice: ");
        int indice = Integer.parseInt(br.readLine());

        try {
            System.out.println(pessoa(indice).toString());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Indice informado não existe na agenda.");
        }
    }

    public void removerPessoaPeloNome() throws IOException {
        System.out.print("Informe o nome da pessoa a ser removida: ");
        String nome = br.readLine();
        remover(nome);
    }

    public void menu() throws IOException {
        int opcaoSelecionada = 0;
        do {
            System.out.println("--------------MENU----------------- ");
            System.out.println("0. Terminar");
            System.out.println("1. Adicionar pessoa");
            System.out.println("2. Listar pessoas cadastradas");
            System.out.println("3. Imprimir pessoa por índice");
            System.out.println("4. Remover pessoa por nome");
            System.out.print("Escolha uma opção: ");
            opcaoSelecionada = Integer.parseInt(br.readLine());

            System.out.println("\n");
            switch (opcaoSelecionada) {
                case 1:
                    criarPessoa();
                    break;
                case 2:
                    listarPessoasCadastradas();
                    break;
                case 3:
                    imprimirPessoaPeloIndice();
                    break;
                case 4:
                    removerPessoaPeloNome();
                    break;
                default:
                    break;
            }
        } while (opcaoSelecionada != 0);
        System.out.println("Sistema finalizado!");
        br.close();
    }
}
