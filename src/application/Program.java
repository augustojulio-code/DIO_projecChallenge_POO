package application;

import java.time.LocalDate;
import java.util.Locale;

import com.dominio.Bootcamp;
import com.dominio.Conteudo;
import com.dominio.Curso;
import com.dominio.Dev;
import com.dominio.Mentoria;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Curso curso = new Curso();
		Curso curso2 = new Curso();
		Mentoria mentoria = new Mentoria();
		Bootcamp bootcamp = new Bootcamp();
		Bootcamp bootcamp2 = new Bootcamp();
		Dev devJulio = new Dev();
		Dev devAugusto = new Dev();
		
		devJulio.setNome("Julio");
		devAugusto.setNome("Augusto");
		
		
		curso.setTitulo("Curso Java");
		curso.setDescricao("Descrição Curso Java");
		curso.setCargaHoraria(8);
		
		curso2.setTitulo("Curso React native");
		curso2.setDescricao("Descrição Curso react native");
		curso2.setCargaHoraria(10);

		//System.out.println(curso);

		

		mentoria.setTitulo("Mentoria Java");
		mentoria.setDescricao("Descrição Mentoria Java");
		mentoria.setData(LocalDate.now());

		//System.out.println(mentoria);
		
		bootcamp.setNome("Bootcamp Dev. Java");
		bootcamp.setDescricao("Descrição bootcamp Java");
		bootcamp.getConteudos().add(curso);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		
		devJulio.inscreverBootcamp(bootcamp);
		devAugusto.inscreverBootcamp(bootcamp);
		
		System.out.println("Conteudos Incritos Julio: "+ devJulio.getConteudosInscritos());
		devJulio.progresso();
		devJulio.progresso();
		System.out.println("Conteudos Incritos Julio: "+ devJulio.getConteudosConcluidos());
		System.out.println("Conteudos Incritos Julio: "+ devJulio.getConteudosInscritos());
		System.out.println("XP: "+devJulio.calcularXp());
		
		System.out.println("---------------------------");
		
		System.out.println("Conteudos Incritos Augusto: "+ devAugusto.getConteudosInscritos());
		devAugusto.progresso();
		System.out.println("Conteudos Incritos Augusto: "+ devJulio.getConteudosConcluidos());
		System.out.println("XP: "+devAugusto.calcularXp());

		
	}

}
