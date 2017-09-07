package com.p4p4l4gu4x.gabarito.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Questao {

	@Id
	private String id;
	private String enunciado;
	private String respostaCerta;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public String getRespostaCerta() {
		return respostaCerta;
	}

	public void setRespostaCerta(String respostaCerta) {
		this.respostaCerta = respostaCerta;
	}
}
