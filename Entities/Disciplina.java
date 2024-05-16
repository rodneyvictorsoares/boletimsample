package Entities;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nome;
        private List<Double> notas = new ArrayList<>();

        public Disciplina(String nome) {
            this.nome = nome;
        }

        public void adicionarNota(double nota) {
            notas.add(nota);
        }

        public String getNome() {
            return nome;
        }

        public List<Double> getNotas() {
            return notas;
        }
}
