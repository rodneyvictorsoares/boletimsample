package Controller;

import java.util.List;
import java.util.Scanner;

import Entities.Aluno;
import Entities.Disciplina;
import Services.CadastrarAluno;
import Services.CadastrarDisciplina;
import Services.LancarNota;
import Services.VisualizarBoletim;


public class Menu {
    private List<Aluno> alunos;
    private List<Disciplina> disciplinas;
    private Scanner scanner;

    public Menu(List<Aluno> alunos, List<Disciplina> disciplinas, Scanner scanner) {
        this.alunos = alunos;
        this.disciplinas = disciplinas;
        this.scanner = scanner;
    }

    public void mostrarMenu() {
        System.out.println("Menu:");
        System.out.println("1. Cadastrar Aluno");
        System.out.println("2. Cadastrar Disciplina");
        System.out.println("3. Visualizar Boletim de um Aluno");
        System.out.println("4. Lançar Nota");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");

        int opcao = scanner.nextInt();
        scanner.nextLine(); // Limpar a nova linha do buffer

        switch (opcao) {
            case 1:
                CadastrarAluno.cadastrarAluno(alunos, disciplinas, scanner);
                break;
            case 2:
                CadastrarDisciplina.cadastrarDisciplina(disciplinas, scanner);
                break;
            case 3:
                VisualizarBoletim.visualizarBoletim(alunos, scanner);
                break;
            case 4:
                LancarNota.lancarNota(alunos, scanner);
                break;
            case 0:
                System.out.println("Encerrando o programa.");
                System.exit(0);
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }
}
