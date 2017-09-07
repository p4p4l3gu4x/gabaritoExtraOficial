package com.p4p4l4gu4x.gabarito;

import java.util.ArrayList;

import com.p4p4l4gu4x.gabarito.model.Aluno;
import com.p4p4l4gu4x.gabarito.model.Grupo;
import com.p4p4l4gu4x.gabarito.model.Prova;
import com.p4p4l4gu4x.gabarito.model.Questao;
import com.p4p4l4gu4x.gabarito.model.RespostaProva;
import com.p4p4l4gu4x.gabarito.model.RespostaQuestao;

public class ModelTest {

	public void modelTest(){
		Aluno aluno = new Aluno();
		aluno.setNome("Aluno 1");
		aluno.setEmail("aluno1@aluno1.com");
		
		Grupo grupo = new Grupo();
		grupo.setNome("Grupo 1");
		grupo.setAlunos(new ArrayList<Aluno>());
		grupo.getAlunos().add(aluno);
		grupo.setProvas(new ArrayList<Prova>());
		
		Prova prova = new Prova();
		prova.setNome("Prova 1");
		prova.setQuantidadeQuestoes(20);
		prova.setRespostas(new ArrayList<RespostaProva>());
		
		RespostaProva respostaProva = new RespostaProva();
		respostaProva.setAluno(aluno);
		respostaProva.setRespostasQuestao(new ArrayList<RespostaQuestao>());
		
		Questao questao = new Questao();
		questao.setEnunciado("Enunciado 1");
		questao.setRespostaCerta("A");
		
		RespostaQuestao respostaQuestao = new RespostaQuestao();
		respostaQuestao.setQuestao(questao);
		respostaQuestao.setResposta("B");
		
	}
}
