package Services;

import java.util.List;
import java.util.Scanner;

import Entities.Aluno;
import Entities.Disciplina;

public class VisualizarBoletim {
    public static void visualizarBoletim(List<Aluno> alunos, Scanner scanner) {
        System.out.print("Nome do Aluno: ");
        String nomeAluno = scanner.nextLine();
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equalsIgnoreCase(nomeAluno)) {
                System.out.println("Boletim de " + aluno.getNome());
                for (Disciplina disciplina : aluno.getDisciplinas()) {
                    System.out.println("Disciplina: " + disciplina.getNome());
                    List<Double> notas = disciplina.getNotas();
                    if (!notas.isEmpty()) {
                        double media = notas.stream().mapToDouble(Double::doubleValue).average().orElse(0);
                        System.out.println("Notas: " + notas);
                        System.out.println("Média: " + media);
                        System.out.println("Resultado: " + (media >= 5 ? "Aprovado" : "Reprovado"));
                    } else {
                        System.out.println("Notas: Nenhuma nota lançada");
                    }
                }
                return;
            }
        }
        System.out.println("Aluno não encontrado.");
    }
}
