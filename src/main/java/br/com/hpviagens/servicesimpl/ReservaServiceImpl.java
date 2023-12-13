package br.com.hpviagens.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hpviagens.DTO.ReservaDTO;
import br.com.hpviagens.entidades.Reserva;
import br.com.hpviagens.repository.ReservaRepository;
import br.com.hpviagens.services.ReservaService;

@Service
public class ReservaServiceImpl implements ReservaService {
	@Autowired
	private ReservaRepository rRepository;

	@Override
	public List<Reserva> reservaAll() {
		return rRepository.findAll();
	}

	@Override
	public Reserva listReservaById(Long id) {

		return rRepository.findById(id).orElseThrow(() -> new RuntimeException("ID: " + id + "Não encontrado"));
	}

	@Override
	public void saveReserva(ReservaDTO reservaDTO) {
		rRepository.saveReserva(reservaDTO.getDataReserva(),reservaDTO.getClienteId(),
				reservaDTO.getViagemId(), reservaDTO.getPagamentoId());
	}
	
	@Override
	public void updateReserva(ReservaDTO reservaDTOUpdate, Long id) {
		Reserva reserva = rRepository.findById(id).orElseThrow(() -> new RuntimeException("ID: " + id + "Não encontrado"));
		if(reserva != null) {
		rRepository.updateReserva(reservaDTOUpdate.getDataReserva(),reservaDTOUpdate.getClienteId(),
				reservaDTOUpdate.getViagemId(), reservaDTOUpdate.getPagamentoId(), id);
		} else {
			new RuntimeException("ID: " + id + "Não encontrado");
		}
	}
	
	@Override
	public void deleteById(Long id) {
		rRepository.deleteById(id);
		
	}
}
