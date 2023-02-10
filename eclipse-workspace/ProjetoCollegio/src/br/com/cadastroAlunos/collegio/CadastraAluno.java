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

	public  void cadastrarAluno(Responsavel dadosresponsável) {

		System.out.println("Nome completo do responsável: ");
		dadosresponsável.setNome(leitor.nextLine());

		if (dadosresponsável.getDadosDoAluno().getDataNasc() == null) {
			
			System.out.println("informar data de Nascimento do Filho  yyyy/mm/dd: ");
			dadosresponsável.getDadosDoAluno()
					.setDataNasc(LocalDate.of(leitor.nextInt(), leitor.nextInt(), leitor.nextInt()));
		}
		
		dadosresponsável.getDadosDoAluno()
				.setIdade(this.idadeDoAluno(dadosresponsável.getDadosDoAluno().getDataNasc()));

		if (dadosresponsável.getDadosDoAluno().getIdade() > 18) {

			this.ensinoSuperior.cadastrarAluno(dadosresponsável);

		} else if (dadosresponsável.getDadosDoAluno().getIdade() > 15
				&& dadosresponsável.getDadosDoAluno().getIdade() < 18) {

			this.ensinoMedio.cadastrarAluno(dadosresponsável);

		} else if (dadosresponsável.getDadosDoAluno().getIdade() > 10
				&& dadosresponsável.getDadosDoAluno().getIdade() < 15) {

			this.ensinoFundamental_II.cadastrarAluno(dadosresponsável);

		}else {

			this.ensinoFundamental_I.cadastrarAlunoEnsinoFundamental_I(dadosresponsável);
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
}
