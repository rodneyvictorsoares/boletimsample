package Services;

import java.util.List;
import java.util.Scanner;

import Entities.Disciplina;

public class CadastrarDisciplina {
    public static void cadastrarDisciplina(List<Disciplina> disciplinas, Scanner scanner) {
        System.out.print("Nome da Disciplina: ");
        String nome = scanner.nextLine();
        Disciplina disciplina = new Disciplina(nome);
        disciplinas.add(disciplina);
        System.out.println("Disciplina cadastrada com sucesso.");
    }
}
