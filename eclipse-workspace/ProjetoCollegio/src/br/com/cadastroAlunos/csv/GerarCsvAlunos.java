package br.com.cadastroAlunos.csv;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVWriter;

import br.com.aluno.collegio.entity.Responsavel;

public class GerarCsvAlunos {

	public GerarCsvAlunos() {
	}

	public String[] gerarCsvAluno(List<Responsavel> lista) {

		

		for (Responsavel responsavel : lista) {

			
			try {

				FileWriter myWriter = new FileWriter(" Alunos.csv ");
				CSVWriter csv = new CSVWriter(myWriter);
				
				String[] headrs = {"Nome do Pai", "Cpf do Pai" , "Nome do Aluno" , "Rg do Aluno" , "Idade do Aluno"};
				List<String[]> dados = new ArrayList<>();
				
				String[] item = {responsavel.getNome(),responsavel.getCpf(), responsavel.getDadosDoAluno().getNome(),responsavel.getDadosDoAluno().getRg(),String.valueOf(responsavel.getDadosDoAluno().getIdade())};

				dados.add(headrs);
			    dados.add(item);
				
			    csv.writeAll(dados);
				csv.flush();
				csv.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		return null;

	}
}
