package br.com.alunosmatriculados.collegio;

import java.util.Objects;
import java.util.Random;

import br.com.alunocadastrados.collegio.CadastraAluno;
import br.com.alunocadastrados.collegio.Pais;

public class MatriculaDoAluno {
	
	private Random numMatricula;
	
	public MatriculaDoAluno  AlunoMatriculados(Pais pai) {
		
		if(Objects.nonNull(pai.getDadosDoAluno().getNome()) && Objects.nonNull(pai.getDadosDoAluno().getRg())
				&& Objects.nonNull(pai.getDadosDoAluno().getDataNasc()) && Objects.nonNull(pai.getDadosDoAluno().getRaca())){
			
			pai.getDadosDoAluno().getNome();
			pai.getDadosDoAluno().getDataNasc();
			pai.getDadosDoAluno().getRaca();
			pai.getDadosDoAluno().getNacionalidade();
		    pai.getDadosDoAluno().getRg();
		    	  
		}else {
			CadastraAluno cd = new CadastraAluno();
			cd.cadastroDeEspera(pai);
			
		}
		  return (MatriculaDoAluno) numMatricula.ints(); 	
	}

	@Override
	public String toString() {
		return "MatriculaDoAluno [numMatricula=" + numMatricula + "]";
	}
	

}
