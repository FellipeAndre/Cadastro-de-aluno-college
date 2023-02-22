package br.com.cadastroAlunos.csv.csv;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.opencsv.CSVWriter;

import br.com.aluno.collegio.entity.Aluno;

public class GerarCsvAlunos {

	public GerarCsvAlunos() {
	}

	public String gerarCsvAluno(List<Aluno> list) {

		FileWriter myWriter = null;
		try {
			myWriter = new FileWriter(" Alunos Fundamental.I.csv ");

			CSVWriter csv = new CSVWriter(myWriter);

			for (Aluno aluno : list) {

				String data = aluno.getDataNasc().toString();
				LocalDate ld = LocalDate.parse(data, DateTimeFormatter.ISO_LOCAL_DATE);
				String dataNasc = String.valueOf(ld.toString());

				String[] headrs = { "Nome do Aluno", "Cpf do Aluno", "Idade do Aluno", "Data de Nasc." };
				List<String[]> dados = new ArrayList<String[]>();

				String[] item = { aluno.getNome(), aluno.getCpf(), String.valueOf(aluno.getIdade()), dataNasc };

				dados.add(headrs);
				dados.add(item);

				csv.writeAll(dados);

			}

			csv.flush();
			csv.close();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro ao exportar arquivo");

		}

		return myWriter.toString();

	}

	public void gerarXls(List<Aluno> list) {
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet firstSheet = workbook.createSheet("Alunos Ensino Fund.I");

		FileOutputStream myWriter = null;
		try {
			myWriter = new FileOutputStream(" Alunos Fundamental.I.csv ");

			int i = 0;

			for (Aluno aluno : list) {

				HSSFRow row = firstSheet.createRow(i);

				row.createCell(0).setCellValue(aluno.getNome());
				row.createCell(1).setCellValue(aluno.getCpf());
				row.createCell(2).setCellValue(aluno.getIdade());

				String data = aluno.getDataNasc().toString();
				LocalDate ld = LocalDate.parse(data, DateTimeFormatter.ISO_LOCAL_DATE);
				String dataNasc = String.valueOf(ld.toString());

				row.createCell(3).setCellValue(dataNasc);

			}

			workbook.write(myWriter);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro ao exportar arquivo");
		} finally {
			try {

				myWriter.flush();
				myWriter.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
