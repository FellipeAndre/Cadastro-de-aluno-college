package br.com.cadastroEnsinoFundamental1.collegio.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

import br.com.aluno.collegio.entity.Aluno;
import br.com.cadastroAlunos.collegio.collegio.Secretaria;
import br.com.cadastroAlunos.csv.csv.GerarCsvAlunos;


public class CadastrarAlunoEnsinoFundamental_I{
	
	Scanner leitor = new Scanner(System.in);
	private static List<Aluno> responsavelDoalunos = new ArrayList<Aluno>();
	private Secretaria gerarMatricula = new Secretaria();
	private GerarCsvAlunos csv = new GerarCsvAlunos();	
	public CadastrarAlunoEnsinoFundamental_I() {
	}
	
	public CadastrarAlunoEnsinoFundamental_I(Scanner leitor){

		this.leitor = leitor;
	}
	
	
	public void cadastrarAlunoEnsinoFundamental_I(Aluno dadosresponsavel) {
		
		if(Objects.nonNull(dadosresponsavel.getDataNasc()) &&
		Objects.nonNull(dadosresponsavel.getIdade())) {
		
		System.out.println("Digite seu nome completo: ");
		dadosresponsavel.setNome(leitor.nextLine());
		System.out.println("Digite seu Cpf: ");
		dadosresponsavel.setCpf(leitor.nextLine());
		
		}
		
		csv.gerarCsvAluno(this.lista(dadosresponsavel));
		
		this.SaidaDados(getResponsavelDoalunos(), gerarMatricula.gerarMatriculaDoAluno(dadosresponsavel));
		
	}
	
	private void SaidaDados(List<Aluno> list, Random gerarMatriculaDoAluno) {
        
		for (Aluno responsavel : list) {
			
			System.out.println(responsavel);
		}
		System.out.println(gerarMatriculaDoAluno.nextInt());
	}

	List<Aluno> lista(Aluno dadosresponsavel ){
		
		CadastrarAlunoEnsinoFundamental_I.responsavelDoalunos.add(dadosresponsavel);
		
		if(CadastrarAlunoEnsinoFundamental_I.responsavelDoalunos.isEmpty()) {
			
			System.out.println("Lista Vazia");
		}
		
		return this.getResponsavelDoalunos();
	}

	public List<Aluno> getResponsavelDoalunos() {
		return CadastrarAlunoEnsinoFundamental_I.responsavelDoalunos;
	}

	
}
