import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Controller.Menu;
import Entities.Aluno;
import Entities.Disciplina;

public class BoletimEscolar {
    private static List<Aluno> alunos = new ArrayList<>();
    private static List<Disciplina> disciplinas = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Menu menu = new Menu(alunos, disciplinas, scanner);

        while (true) {
            menu.mostrarMenu();
        }
    }
}
