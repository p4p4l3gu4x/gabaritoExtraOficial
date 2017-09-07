package com.p4p4l4gu4x.gabarito.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.p4p4l4gu4x.gabarito.model.Aluno;

public  interface AlunoRepository extends MongoRepository<Aluno, String>  {

}
