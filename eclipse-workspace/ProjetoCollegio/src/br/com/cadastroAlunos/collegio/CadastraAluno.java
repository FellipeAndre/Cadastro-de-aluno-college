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

	
	public void cadastrarAluno(Pais dadosresponsável) {
		
		dadosresponsável.setNome(leitor.nextLine());
		
		System.out.println("informar data de Nascimento do Filho");
		dadosresponsável.getDadosDoAluno().setDataNasc(LocalDate.of(leitor.nextInt(), leitor.nextInt(), leitor.nextInt()));
		dadosresponsável.getDadosDoAluno().setIdade(this.idadeDoAluno(dadosresponsável.getDadosDoAluno().getDataNasc()));
		
		if(dadosresponsável.getDadosDoAluno().getIdade() > 18) {
			
			this.ensinoSuperior.cadastrarAluno(dadosresponsável);
			
		}else if(dadosresponsável.getDadosDoAluno().getIdade() > 15 &&
				dadosresponsável.getDadosDoAluno().getIdade() < 18) {
			
		    this.ensinoMedio.cadastrarAluno(dadosresponsável);
		    
		}else if(dadosresponsável.getDadosDoAluno().getIdade() > 10 &&
				dadosresponsável.getDadosDoAluno().getIdade() < 15) {
			
			this.ensinoFundamental_II.cadastrarAluno(dadosresponsável);
			
		}else if(dadosresponsável.getDadosDoAluno().getIdade() > 5 &&
				dadosresponsável.getDadosDoAluno().getIdade() < 10) {
			
		    this.ensinoFundamental_I.cadastrarAluno(dadosresponsável);
		    
		}else {
			
			System.out.println("Não atendemos Ensino Infantil");
		}
	}
	
	/*
	 * método reponsável por retornar a idade do Aluno para validar o Ensino 
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
