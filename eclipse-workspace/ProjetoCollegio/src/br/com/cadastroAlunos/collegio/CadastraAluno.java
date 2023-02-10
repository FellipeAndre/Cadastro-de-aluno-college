package br.com.cadastroAlunos.collegio;

import java.time.LocalDate;
import java.util.Scanner;

import br.com.aluno.collegio.Responsavel;
import br.com.cadastroEnsinoFundamental1.collegio.CadastrarAlunoEnsinoFundamental_I;
import br.com.cadastroEnsinoFundametal2.collegio.CadastrarAlunoEnsinoFundamental_II;
import br.com.cadastroEnsinoMedio.collegio.CadastrarAlunoEnsinoMedio;
import br.com.cadastroSuperior.collegio.CadastrarAlunoEnsinoSuperior;

public class CadastraAluno implements StatusDeCadastrarAlunos {

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

	public  void cadastrarAluno(Responsavel dadosrespons�vel) {

		System.out.println("Nome completo do respons�vel: ");
		dadosrespons�vel.setNome(leitor.nextLine());

		if (dadosrespons�vel.getDadosDoAluno().getDataNasc() == null) {
			
			System.out.println("informar data de Nascimento do Filho  yyyy/mm/dd: ");
			dadosrespons�vel.getDadosDoAluno()
					.setDataNasc(LocalDate.of(leitor.nextInt(), leitor.nextInt(), leitor.nextInt()));
		}
		
		dadosrespons�vel.getDadosDoAluno()
				.setIdade(this.idadeDoAluno(dadosrespons�vel.getDadosDoAluno().getDataNasc()));

		if (dadosrespons�vel.getDadosDoAluno().getIdade() > 18) {

			this.ensinoSuperior.cadastrarAluno(dadosrespons�vel);

		} else if (dadosrespons�vel.getDadosDoAluno().getIdade() > 15
				&& dadosrespons�vel.getDadosDoAluno().getIdade() < 18) {

			this.ensinoMedio.cadastrarAluno(dadosrespons�vel);

		} else if (dadosrespons�vel.getDadosDoAluno().getIdade() > 10
				&& dadosrespons�vel.getDadosDoAluno().getIdade() < 15) {

			this.ensinoFundamental_II.cadastrarAluno(dadosrespons�vel);

		}else {

			this.ensinoFundamental_I.cadastrarAlunoEnsinoFundamental_I(dadosrespons�vel);
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
