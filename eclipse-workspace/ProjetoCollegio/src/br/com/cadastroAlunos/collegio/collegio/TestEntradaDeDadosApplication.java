package br.com.cadastroAlunos.collegio.collegio;

import java.util.Scanner;

import br.com.aluno.collegio.entity.Aluno;


public class TestEntradaDeDadosApplication {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		CadastraAluno cd = new CadastraAluno(leitor);
		Aluno p = new Aluno();
		cd.cadastrarAluno(p);
		
		leitor.close();
	}

}