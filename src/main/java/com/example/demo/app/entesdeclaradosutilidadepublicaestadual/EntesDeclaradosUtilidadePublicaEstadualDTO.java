package com.example.demo.app.entesdeclaradosutilidadepublicaestadual;

public class EntesDeclaradosUtilidadePublicaEstadualDTO {
	public Long id;
	public Long cdentepub;
	public String lei;
	public String nomeEntidade;

	public EntesDeclaradosUtilidadePublicaEstadualDTO() {
	}

	public EntesDeclaradosUtilidadePublicaEstadualDTO(Long cdentepub, String lei, String nomeEntidade, Long id) {
		super();
		this.id = id;
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
