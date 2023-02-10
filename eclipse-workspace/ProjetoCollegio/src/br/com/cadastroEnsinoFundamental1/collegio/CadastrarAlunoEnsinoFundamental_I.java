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
	
	
	public void cadastrarAlunoEnsinoFundamental_I(Responsavel dadosrespons�vel) {
		
		if(Objects.nonNull(dadosrespons�vel.getDadosDoAluno().getDataNasc()) &&
		Objects.nonNull(dadosrespons�vel.getDadosDoAluno().getIdade())) {
		
		System.out.println("Digite seu nome completo: ");
		dadosrespons�vel.getDadosDoAluno().setNome(leitor.nextLine());
		System.out.println("Digite seu RG: ");
		dadosrespons�vel.getDadosDoAluno().setRg(leitor.nextLine());
		
		}
		
	}

}
