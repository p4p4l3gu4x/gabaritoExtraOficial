package com.p4p4l4gu4x.gabarito.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class RespostaQuestao {

	@Id
	private String id;
	private Questao questao;
	private String resposta;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Questao getQuestao() {
		return questao;
	}

	public void setQuestao(Questao questao) {
		this.questao = questao;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

}
