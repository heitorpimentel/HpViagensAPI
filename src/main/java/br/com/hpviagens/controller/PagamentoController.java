package br.com.hpviagens.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hpviagens.entidades.Pagamento;
import br.com.hpviagens.services.PagamentoService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/pagamento")
public class PagamentoController {
	@Autowired
	private PagamentoService pService;
	
	@GetMapping
	public List<Pagamento> pagamentoAll(){
		
		return pService.pagamentoAll();
	}
	
	@PostMapping("/salvarPagamento")
	public Pagamento salvar(@RequestBody Pagamento pagamento) {
		
		return pService.savePagamento(pagamento);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Pagamento> getPagamentoById(@PathVariable Long id) {
		Pagamento pagamento = pService.listPagamentoById(id);

		return ResponseEntity.ok(pagamento);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Pagamento> updatePagamento(@PathVariable Long id, @RequestBody Pagamento pagamentoUpdate) {
		Pagamento pagamento = pService.listPagamentoById(id);
		pagamento.setDataPagamento(pagamentoUpdate.getDataPagamento());
		pagamento.setValorPag(pagamentoUpdate.getValorPag());
		pagamento.setFormaPag(pagamentoUpdate.getFormaPag());
		pagamento.setParcela(pagamentoUpdate.getParcela());
		

		pService.updatePagamento(id, pagamentoUpdate);

		return ResponseEntity.ok(pagamento);
	}
	
	@DeleteMapping("/{id}")
	public void deletePagamento(@PathVariable Long id) {
		pService.deleteById(id);
	}
}
