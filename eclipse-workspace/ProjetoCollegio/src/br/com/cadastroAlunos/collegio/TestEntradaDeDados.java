package br.com.cadastroAlunos.collegio;

import java.util.Scanner;

import br.com.aluno.collegio.Pais;

public class TestEntradaDeDados {

	public static void main(String[] args) {

		
		Scanner leitor = new Scanner(System.in);
		CadastraAluno cd = new CadastraAluno(leitor);
		Pais p = new Pais();
		cd.cadastrarAluno(p);
		
	}

}