package com.projclientes.projclientes.repository;

import com.projclientes.projclientes.model.Fornecedor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FornecedorRepository extends MongoRepository<Fornecedor, String> {
}
