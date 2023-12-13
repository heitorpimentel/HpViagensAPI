package br.com.hpviagens.services;

import java.util.List;

import br.com.hpviagens.DTO.ReservaDTO;
import br.com.hpviagens.entidades.Reserva;

public interface ReservaService {
	List<Reserva> reservaAll();

	Reserva listReservaById(Long id);

	void saveReserva(ReservaDTO reservaDTO);

	void updateReserva( ReservaDTO reservaDTOUpdate, Long id);

	void deleteById(Long id);
}
