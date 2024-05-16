package Services;

import java.util.List;
import java.util.Scanner;

import Entities.Aluno;
import Entities.Disciplina;

public class LancarNota {
    public static void lancarNota(List<Aluno> alunos, Scanner scanner) {
        System.out.print("Nome do Aluno: ");
        String nomeAluno = scanner.nextLine();
        System.out.print("Nome da Disciplina: ");
        String nomeDisciplina = scanner.nextLine();
        System.out.print("Nota: ");
        double nota = scanner.nextDouble();
        scanner.nextLine(); // Limpar a nova linha do buffer

        for (Aluno aluno : alunos) {
            if (aluno.getNome().equalsIgnoreCase(nomeAluno)) {
                for (Disciplina disciplina : aluno.getDisciplinas()) {
                    if (disciplina.getNome().equalsIgnoreCase(nomeDisciplina)) {
                        disciplina.adicionarNota(nota);
                        System.out.println("Nota lançada com sucesso.");
                        return;
                    }
                }
            }
        }
        System.out.println("Aluno ou Disciplina não encontrado.");
    }
}
