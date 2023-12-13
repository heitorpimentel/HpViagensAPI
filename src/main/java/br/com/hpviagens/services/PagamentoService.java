package br.com.hpviagens.services;

import java.util.List;

import br.com.hpviagens.entidades.Pagamento;

public interface PagamentoService {
	List<Pagamento> pagamentoAll();

	Pagamento listPagamentoById(Long id);

	Pagamento savePagamento(Pagamento pagamento);

	Pagamento updatePagamento(Long id, Pagamento pagamentoUpdate);

	void deleteById(Long id);

}
