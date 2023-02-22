package br.com.cadastroAlunos.collegio;

import java.util.Random;

import br.com.aluno.collegio.entity.Responsavel;

public class Secretaria {
	
  private Random matricula = new Random();	
  
  
  public Secretaria() {
}

   public Random gerarMatriculaDoAluno(Responsavel aluno) {
	  
	 return matricula;
   }

   
@Override
public String toString() {
	return "Secretaria [matricula=" + matricula + "]";
}
  
}
