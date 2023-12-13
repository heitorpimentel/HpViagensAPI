package br.com.hpviagens.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hpviagens.entidades.Pagamento;
import br.com.hpviagens.repository.PagamentoRepository;
import br.com.hpviagens.services.PagamentoService;

@Service
public class PagamentoServiceImpl implements PagamentoService {
	@Autowired
	private PagamentoRepository pRepository;

	@Override
	public List<Pagamento> pagamentoAll() {
		return pRepository.findAll();
	}

	@Override
	public Pagamento listPagamentoById(Long id) {

		return pRepository.findById(id).orElseThrow(() -> new RuntimeException("ID: " + id + "Não encontrado"));
	}

	@Override
	public Pagamento savePagamento(Pagamento pagamento) {
		
		return pRepository.save(pagamento);
	}

	@Override
	public Pagamento updatePagamento(Long id, Pagamento pagamentoUpdate) {
		Pagamento pExistente = pRepository.findById(id).orElseThrow(() -> new RuntimeException("ID: " + id + "Não encontrado"));
		pExistente.setDataPagamento(pagamentoUpdate.getDataPagamento());
		pExistente.setValorPag(pagamentoUpdate.getValorPag());
		pExistente.setFormaPag(pagamentoUpdate.getFormaPag());
		pExistente.setParcela(pagamentoUpdate.getParcela());
		return pRepository.save(pExistente);
	}

	@Override
	public void deleteById(Long id) {
		pRepository.deleteById(id);
		
	}
}
