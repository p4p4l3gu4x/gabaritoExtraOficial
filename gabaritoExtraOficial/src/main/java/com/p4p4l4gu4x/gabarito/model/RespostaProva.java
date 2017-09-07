package com.p4p4l4gu4x.gabarito.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class RespostaProva {

	@Id
	private String id;
	private Aluno aluno;
	private List<RespostaQuestao> respostasQuestao;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public List<RespostaQuestao> getRespostasQuestao() {
		return respostasQuestao;
	}

	public void setRespostasQuestao(List<RespostaQuestao> respostasQuestao) {
		this.respostasQuestao = respostasQuestao;
	}
}
