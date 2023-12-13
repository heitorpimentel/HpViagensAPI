package br.com.hpviagens.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hpviagens.entidades.Cliente;
import br.com.hpviagens.repository.ClienteRepository;
import br.com.hpviagens.services.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{
	
	@Autowired
	private ClienteRepository cRepository;

	@Override
	public List<Cliente> clienteAll() {
		return cRepository.findAll();
	}

	@Override
	public Cliente listClienteById(Long id) {

		return cRepository.findById(id).orElseThrow(() -> new RuntimeException("ID: " + id + "Não encontrado"));
	}

	@Override
	public Cliente saveCliente(Cliente cliente) {
		
		return cRepository.save(cliente);
	}

	@Override
	public Cliente updateCliente(Long id, Cliente clienteUpdate) {
		Cliente cExistente = cRepository.findById(id).orElseThrow(() -> new RuntimeException("ID: " + id + "Não encontrado"));
		cExistente.setNome(clienteUpdate.getNome());
		cExistente.setCpf(clienteUpdate.getCpf());
		cExistente.setTelefone(clienteUpdate.getTelefone());
		cExistente.setDataNascimento(clienteUpdate.getDataNascimento());
		cExistente.setSexo(clienteUpdate.getSexo());
		cExistente.setEmail(clienteUpdate.getEmail());
		cExistente.setSenha(clienteUpdate.getSenha());
		return cRepository.save(cExistente);
	}

	@Override
	public void deleteById(Long id) {
		cRepository.deleteById(id);
		
	}

}
