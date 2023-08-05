package com.example.demo.app.entesdeclaradosutilidadepublicaestadual;

public class EntesDeclaradosUtilidadePublicaEstadualDTO {
	public Long cdentepub;
	public String lei;
	public String nomeEntidade;

	public EntesDeclaradosUtilidadePublicaEstadualDTO() {
	}

	public EntesDeclaradosUtilidadePublicaEstadualDTO(Long cdentepub, String lei, String nomeEntidade) {
		super();
		this.cdentepub = cdentepub;
		this.lei = lei;
		this.nomeEntidade = nomeEntidade;
	}

	public Long getCdentepub() {
		return cdentepub;
	}

	public void setCdentepub(Long cdentepub) {
		this.cdentepub = cdentepub;
	}

	public String getLei() {
		return lei;
	}

	public void setLei(String lei) {
		this.lei = lei;
	}

	public String getNomeEntidade() {
		return nomeEntidade;
	}

	public void setNomeEntidade(String nomeEntidade) {
		this.nomeEntidade = nomeEntidade;
	}

}
