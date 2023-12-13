package br.com.hpviagens.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.hpviagens.entidades.Viagem;

public interface ViagemRepository extends JpaRepository<Viagem, Long> {

}
