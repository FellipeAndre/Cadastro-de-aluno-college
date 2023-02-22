package br.com.cadastroAlunos.collegio;

import java.util.Scanner;

import br.com.aluno.collegio.entity.Responsavel;

public class TestEntradaDeDados {

	public static void main(String[] args) {

		
		Scanner leitor = new Scanner(System.in);
		CadastraAluno cd = new CadastraAluno(leitor);
		Responsavel p = new Responsavel();
		cd.cadastrarAluno(p);
		
		leitor.close();
	}

}