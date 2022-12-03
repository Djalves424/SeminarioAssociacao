package Seminario_Associacao;

import Seminario_Associacao.dominio.Aluno;
import Seminario_Associacao.dominio.Local;
import Seminario_Associacao.dominio.Professor;
import Seminario_Associacao.dominio.Seminario;

public class AssociacaoTeste01 {

	public static void main(String[] args) {

		Local local = new Local("Rua das laranjeiras");
		Aluno aluno = new Aluno("Jessica, ", 45);
		Professor professor = new Professor("Barba Branca", "Pirata");
		Aluno[] alunosParaSeminario = { aluno };

		Seminario seminario = new Seminario("Onde achar one piece", alunosParaSeminario, local);

		Seminario[] seminariosDisponiveis = { seminario };

		professor.setSeminarios(seminariosDisponiveis);

		professor.imprime();

	}

}
