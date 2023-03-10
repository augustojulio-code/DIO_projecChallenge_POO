package com.dominio;

public class Curso extends Conteudo{
	
	
	private Integer cargaHoraria;
	
	public Curso() {}


	public Integer getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public String toString() {
		return "Curso- " + getTitulo() + ", descricao= " + getDescricao() + ", cargaHoraria= " + cargaHoraria+"Hr";
	}


	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return XP_PADRAO*cargaHoraria;
	}
	
	

}
