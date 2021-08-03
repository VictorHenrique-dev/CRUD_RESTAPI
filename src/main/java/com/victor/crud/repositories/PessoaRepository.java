package com.victor.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.victor.crud.entities.Pessoa;

@Repository
public interface PessoaRepository  extends JpaRepository<Pessoa, Long>{

}
