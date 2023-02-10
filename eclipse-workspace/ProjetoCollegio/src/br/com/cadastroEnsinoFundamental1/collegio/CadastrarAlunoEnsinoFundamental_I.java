package br.com.cadastroEnsinoFundamental1.collegio;

import java.util.Objects;
import java.util.Scanner;

import br.com.aluno.collegio.Responsavel;

public class CadastrarAlunoEnsinoFundamental_I{
	
	Scanner leitor = new Scanner(System.in);
	
	public CadastrarAlunoEnsinoFundamental_I() {
	}
	
	public CadastrarAlunoEnsinoFundamental_I(Scanner leitor){

		this.leitor = leitor;
	}
	
	
	public void cadastrarAlunoEnsinoFundamental_I(Responsavel dadosresponsável) {
		
		if(Objects.nonNull(dadosresponsável.getDadosDoAluno().getDataNasc()) &&
		Objects.nonNull(dadosresponsável.getDadosDoAluno().getIdade())) {
		
		System.out.println("Digite seu nome completo: ");
		dadosresponsável.getDadosDoAluno().setNome(leitor.nextLine());
		System.out.println("Digite seu RG: ");
		dadosresponsável.getDadosDoAluno().setRg(leitor.nextLine());
		
		}
		
	}

}
