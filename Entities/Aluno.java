package Entities;

import java.util.ArrayList;
import java.util.List;

/**
 * Aluno
 */
public class Aluno {

    private String nome;
        private List<Disciplina> disciplinas = new ArrayList<>();

        public Aluno(String nome, List<Disciplina> disciplinas) {
            this.nome = nome;
            this.disciplinas = disciplinas;
        }

        public String getNome() {
            return nome;
        }

        public List<Disciplina> getDisciplinas() {
            return disciplinas;
        }
}