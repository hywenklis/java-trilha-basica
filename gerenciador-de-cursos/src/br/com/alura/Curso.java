package br.com.alura;

import java.util.*;

public class Curso {

    private final String nome;
    private final String instrutor;
    private final List<Aula> aulas = new LinkedList<>();
    private final Set<Aluno> alunos = new HashSet<>();
    Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public void adiciona(Aula aula) {
        this.aulas.add(aula);
    }

    public int getTempoTotal() {
        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    @Override
    public String toString() {
        return "[Curso " + nome + ", tempo total: " + this.getTempoTotal() + ", aulas: " + this.aulas + "]";
    }

    public void matricula(Aluno aluno) {
        this.alunos.add(aluno);
        this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    @Override
    public boolean equals(Object obj) {
        Aluno outroAluno = (Aluno) obj;
        return this.nome.equals(outroAluno.getNome());
    }

    @Override
    public int hashCode(){
        return this.nome.hashCode();
    }

    public Aluno buscaMatriculado(int matricula) {
        if(!matriculaParaAluno.containsKey(matricula))
            throw new NoSuchElementException("Aluno não encontrado, Matricula: " + matricula);
        return matriculaParaAluno.get(matricula);
    }
}
