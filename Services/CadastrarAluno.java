package Services;

import java.util.List;
import java.util.Scanner;

import Entities.Aluno;
import Entities.Disciplina;

public class CadastrarAluno {
    public static void cadastrarAluno(List<Aluno> alunos, List<Disciplina> disciplinas, Scanner scanner) {
        System.out.print("Nome do Aluno: ");
        String nome = scanner.nextLine();
        Aluno aluno = new Aluno(nome, disciplinas);
        alunos.add(aluno);
        System.out.println("Aluno cadastrado com sucesso.");
    }
}
