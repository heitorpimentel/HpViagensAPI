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

import br.com.hpviagens.entidades.Viagem;
import br.com.hpviagens.services.ViagemService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/viagem")
public class ViagemController {
	@Autowired
	private ViagemService vService;
	
	@GetMapping
	public List<Viagem> viagemAll(){
		
		return vService.viagemAll();
	}
	
	@PostMapping("/salvarViagem")
	public Viagem salvar(@RequestBody Viagem viagem) {
		
		return vService.saveViagem(viagem);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Viagem> getViagemById(@PathVariable Long id) {
		Viagem viagem = vService.listViagemById(id);

		return ResponseEntity.ok(viagem);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Viagem> updateViagem(@PathVariable Long id, @RequestBody Viagem viagemUpdate) {
		Viagem viagem = vService.listViagemById(id);
		viagem.setOrigem(viagemUpdate.getOrigem());
		viagem.setDestino(viagemUpdate.getDestino());
		viagem.setDataIda(viagemUpdate.getDataIda());
		viagem.setDataVolta(viagemUpdate.getDataVolta());
		

		vService.updateViagem(id, viagemUpdate);

		return ResponseEntity.ok(viagem);
	}
	
	@DeleteMapping("/{id}")
	public void deleteViagem(@PathVariable Long id) {
		vService.deleteById(id);
	}
}
