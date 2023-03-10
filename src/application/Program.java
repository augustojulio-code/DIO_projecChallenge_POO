package application;

import java.time.LocalDate;
import java.util.Locale;

import com.dominio.Conteudo;
import com.dominio.Curso;
import com.dominio.Mentoria;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Curso curso = new Curso();

		curso.setTitulo("Curso Java");
		curso.setDescricao("Descrição Curso Java");
		curso.setCargaHoraria(8);

		System.out.println(curso);

		Mentoria mentoria = new Mentoria();

		mentoria.setTitulo("Mentoria Java");
		mentoria.setDescricao("Descrição Mentoria Java");
		mentoria.setData(LocalDate.now());

		System.out.println(mentoria);

	}

}
