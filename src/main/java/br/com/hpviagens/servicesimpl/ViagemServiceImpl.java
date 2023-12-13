package br.com.hpviagens.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hpviagens.entidades.Viagem;
import br.com.hpviagens.repository.ViagemRepository;
import br.com.hpviagens.services.ViagemService;

@Service
public class ViagemServiceImpl implements ViagemService {
	@Autowired
	private ViagemRepository vRepository;

	@Override
	public List<Viagem> viagemAll() {
		return vRepository.findAll();
	}

	@Override
	public Viagem listViagemById(Long id) {

		return vRepository.findById(id).orElseThrow(() -> new RuntimeException("ID: " + id + "Não encontrado"));
	}

	@Override
	public Viagem saveViagem(Viagem viagem) {
		
		return vRepository.save(viagem);
	}

	@Override
	public Viagem updateViagem(Long id, Viagem viagemUpdate) {
		Viagem vExistente = vRepository.findById(id).orElseThrow(() -> new RuntimeException("ID: " + id + "Não encontrado"));
		vExistente.setOrigem(viagemUpdate.getOrigem());
		vExistente.setDestino(viagemUpdate.getDestino());
		vExistente.setDataIda(viagemUpdate.getDataIda());
		vExistente.setDataVolta(viagemUpdate.getDataVolta());
		return vRepository.save(vExistente);
	}

	@Override
	public void deleteById(Long id) {
		vRepository.deleteById(id);
		
	}
}
