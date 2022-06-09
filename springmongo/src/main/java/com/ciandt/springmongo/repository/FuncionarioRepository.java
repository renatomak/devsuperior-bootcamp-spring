package com.ciandt.springmongo.repository;

import com.ciandt.springmongo.model.Funcionario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FuncionarioRepository extends MongoRepository<Funcionario, String> {
}
