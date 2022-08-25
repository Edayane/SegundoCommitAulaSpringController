package atividade1.example.atividade1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import atividade1.example.atividade1.entity.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}
