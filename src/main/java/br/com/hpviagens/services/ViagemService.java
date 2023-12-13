package br.com.hpviagens.services;

import java.util.List;

import br.com.hpviagens.entidades.Viagem;

public interface ViagemService {

	List<Viagem> viagemAll();

	Viagem listViagemById(Long id);

	Viagem saveViagem(Viagem viagem);

	Viagem updateViagem(Long id, Viagem viagemUpdate);

	void deleteById(Long id);
}
