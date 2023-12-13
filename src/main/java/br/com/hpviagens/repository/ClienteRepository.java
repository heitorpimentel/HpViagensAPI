package br.com.hpviagens.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.hpviagens.entidades.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
