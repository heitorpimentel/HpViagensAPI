package br.com.hpviagens.services;

import java.util.List;

import br.com.hpviagens.entidades.Cliente;

public interface ClienteService {
	
List<Cliente> clienteAll();
	
	Cliente listClienteById(Long id);
	
	Cliente saveCliente(Cliente cliente);
	
	Cliente updateCliente(Long id, Cliente clienteUpdate);
	
	void deleteById(Long id);
}
