package com.p4p4l4gu4x.gabarito.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Prova {

	@Id
	private String id;
	private String nome;
	private Integer quantidadeQuestoes;
	private List<RespostaProva> respostas;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQuantidadeQuestoes() {
		return quantidadeQuestoes;
	}

	public void setQuantidadeQuestoes(Integer quantidadeQuestoes) {
		this.quantidadeQuestoes = quantidadeQuestoes;
	}

	public List<RespostaProva> getRespostas() {
		return respostas;
	}

	public void setRespostas(List<RespostaProva> respostas) {
		this.respostas = respostas;
	}
}
