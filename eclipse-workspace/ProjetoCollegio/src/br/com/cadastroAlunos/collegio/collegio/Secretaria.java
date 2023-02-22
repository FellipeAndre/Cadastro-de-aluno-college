package br.com.cadastroAlunos.collegio.collegio;

import java.util.Random;

import br.com.aluno.collegio.entity.Aluno;

public class Secretaria {
	
  private Random matricula = new Random();	
  
  
  public Secretaria() {
}

   public Random gerarMatriculaDoAluno(Aluno dadosresponsavel) {
	  
	 return matricula;
   }

   
@Override
public String toString() {
	return "Secretaria [matricula=" + matricula + "]";
}
  
}
