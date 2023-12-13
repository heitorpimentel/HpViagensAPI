package br.com.hpviagens.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hpviagens.entidades.Cliente;
import br.com.hpviagens.services.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private ClienteService cService;
	
	@GetMapping("/clientes")
	public List<Cliente> clienteAll(){
		
		return cService.clienteAll();
	}
	
	@PostMapping("/salvarCliente")
	public Cliente salvar(@RequestBody Cliente cliente) {
		
		return cService.saveCliente(cliente);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Cliente> getClienteById(@PathVariable Long id) {
		Cliente cliente = cService.listClienteById(id);

		return ResponseEntity.ok(cliente);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Cliente> updateCliente(@PathVariable Long id, @RequestBody Cliente clienteUpdate) {
		Cliente cliente = cService.listClienteById(id);
		cliente.setNome(clienteUpdate.getNome());
		cliente.setCpf(clienteUpdate.getCpf());
		cliente.setTelefone(clienteUpdate.getTelefone());
		cliente.setDataNascimento(clienteUpdate.getDataNascimento());
		cliente.setSexo(clienteUpdate.getSexo());
		cliente.setEmail(clienteUpdate.getEmail());
		cliente.setSenha(clienteUpdate.getSenha());

		cService.updateCliente(id, clienteUpdate);

		return ResponseEntity.ok(cliente);
	}
	
	@DeleteMapping("/{id}")
	public void deleteCliente(@PathVariable Long id) {
		cService.deleteById(id);
	}
}
