package com.projclientes.projclientes.repository;

import com.projclientes.projclientes.model.Endereco;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends MongoRepository<Endereco, String> {
}
