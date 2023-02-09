package br.com.cadastroAlunos.collegio;

import java.time.LocalDate;
import java.util.Scanner;

import br.com.aluno.collegio.Pais;
import br.com.cadastroEnsinoFundamental1.collegio.CadastrarAlunoEnsinoFundamental_I;
import br.com.cadastroEnsinoMedio.collegio.CadastrarAlunoEnsinoMedio;
import br.com.cadastroSuperior.collegio.CadastrarAlunoEnsinoSuperior;

public class CadastraAluno implements StatusDeCadastrarAlunos {
	
	Scanner leitor;
	Informacoes dados = new Informacoes();
	private CadastrarAlunoEnsinoFundamental_I ensinoFundamental_I;
	private CadastrarAlunoEnsinoFundamental_I ensinoFundamental_II;
	private CadastrarAlunoEnsinoMedio ensinoMedio;
	private CadastrarAlunoEnsinoSuperior ensinoSuperior;
	private MatriculaDoAluno matricula = new MatriculaDoAluno();
	
	/*
	 * Construtor Default
	 * 
	 */
	public CadastraAluno() {}
	
	public CadastraAluno(Scanner leitor) {
		
		this.leitor = leitor;
	}

	
	public void cadastrarAluno(Pais dadosrespons�vel) {
		
		dadosrespons�vel.setNome(leitor.nextLine());
		
		System.out.println("informar data de Nascimento do Filho");
		dadosrespons�vel.getDadosDoAluno().setDataNasc(LocalDate.of(leitor.nextInt(), leitor.nextInt(), leitor.nextInt()));
		dadosrespons�vel.getDadosDoAluno().setIdade(this.idadeDoAluno(dadosrespons�vel.getDadosDoAluno().getDataNasc()));
		
		if(dadosrespons�vel.getDadosDoAluno().getIdade() > 18) {
			
			this.ensinoSuperior.cadastrarAluno(dadosrespons�vel);
			
		}else if(dadosrespons�vel.getDadosDoAluno().getIdade() > 15 &&
				dadosrespons�vel.getDadosDoAluno().getIdade() < 18) {
			
		    this.ensinoMedio.cadastrarAluno(dadosrespons�vel);
		    
		}else if(dadosrespons�vel.getDadosDoAluno().getIdade() > 10 &&
				dadosrespons�vel.getDadosDoAluno().getIdade() < 15) {
			
			this.ensinoFundamental_II.cadastrarAluno(dadosrespons�vel);
			
		}else if(dadosrespons�vel.getDadosDoAluno().getIdade() > 5 &&
				dadosrespons�vel.getDadosDoAluno().getIdade() < 10) {
			
		    this.ensinoFundamental_I.cadastrarAluno(dadosrespons�vel);
		    
		}else {
			
			System.out.println("N�o atendemos Ensino Infantil");
		}
	}
	
	/*
	 * m�todo repons�vel por retornar a idade do Aluno para validar o Ensino 
	 * 
	 */
	private Integer idadeDoAluno(LocalDate dataDeNasciemnto) {
		 
		LocalDate dataAtual = LocalDate.now();
		
		return dataAtual.getYear() - dataDeNasciemnto.getYear();
	}
	
	
	public MatriculaDoAluno getMatricula() {
		return matricula;
	}

	public void setMatricula(MatriculaDoAluno matricula) {
		this.matricula = matricula;
	}	

}
