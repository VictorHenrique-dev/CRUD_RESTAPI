package com.victor.crud.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.victor.crud.entities.Pessoa;
import com.victor.crud.repositories.PessoaRepository;

@Configuration
public class TestConfig implements CommandLineRunner {

	@Autowired
	private PessoaRepository pessoaRepository;

	@Override
	public void run(String... args) throws Exception {

		
		Pessoa p1 = new Pessoa(null, "João Santos", "30", "joao@gmail.com");
		Pessoa p2 = new Pessoa(null, "Maria da Silva", "25", "maria@gmail.com");
		Pessoa p3 = new Pessoa(null, "Bruno Ferreira", "35", "bruno@gmail.com");

		pessoaRepository.saveAll(Arrays.asList(p1, p2, p3));

	}
}