package br.com.hpviagens.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.hpviagens.entidades.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {

}
