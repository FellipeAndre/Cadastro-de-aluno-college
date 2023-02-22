package br.com.cadastroAlunos.collegio.collegio;

import java.time.LocalDate;
import java.util.Scanner;

import br.com.aluno.collegio.entity.Aluno;
import br.com.cadastroEnsinoFundamental1.collegio.service.CadastrarAlunoEnsinoFundamental_I;
import br.com.cadastroEnsinoFundametal2.collegio.collegio.CadastrarAlunoEnsinoFundamental_II;
import br.com.cadastroEnsinoMedio.collegio.collegio.CadastrarAlunoEnsinoMedio;
import br.com.cadastroSuperior.collegio.graduacoes.collegio.CadastrarAlunoEnsinoSuperior;

public class CadastraAluno  {

	Scanner leitor = new Scanner(System.in);
	
	Informacoes dados = new Informacoes();
	private CadastrarAlunoEnsinoFundamental_I ensinoFundamental_I = new CadastrarAlunoEnsinoFundamental_I();
	private CadastrarAlunoEnsinoFundamental_II ensinoFundamental_II = new CadastrarAlunoEnsinoFundamental_II();
	private CadastrarAlunoEnsinoMedio ensinoMedio = new CadastrarAlunoEnsinoMedio();
	private CadastrarAlunoEnsinoSuperior ensinoSuperior;
	
	/*
	 * Construtor Default
	 * 
	 */
	public CadastraAluno() {
	}

	public CadastraAluno(Scanner leitor) {

		this.leitor = leitor;
	}

	public  void cadastrarAluno(Aluno dadosresponsavel) {

		System.out.println("Nome completo do respons�vel: ");
		dadosresponsavel.setNome(leitor.nextLine());

		if (dadosresponsavel.getDataNasc() == null) {
			
			System.out.println("informar data de Nascimento do Filho  yyyy/mm/dd: ");
			dadosresponsavel
					.setDataNasc(LocalDate.of(leitor.nextInt(), leitor.nextInt(), leitor.nextInt()));
		}
		
		dadosresponsavel
				.setIdade(this.idadeDoAluno(dadosresponsavel.getDataNasc()));

		if (dadosresponsavel.getIdade() > 18) {

			this.ensinoSuperior.cadastrarAluno(dadosresponsavel);

		} else if (dadosresponsavel.getIdade() > 15
				&& dadosresponsavel.getIdade() < 18) {

			this.ensinoMedio.cadastrarAluno(dadosresponsavel);

		} else if (dadosresponsavel.getIdade() > 10
				&& dadosresponsavel.getIdade() < 15) {

			this.ensinoFundamental_II.cadastrarAluno(dadosresponsavel);

		}else {

			this.ensinoFundamental_I.cadastrarAlunoEnsinoFundamental_I(dadosresponsavel);
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
}
