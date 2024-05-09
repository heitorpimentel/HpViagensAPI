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

import br.com.hpviagens.DTO.ReservaDTO;
import br.com.hpviagens.entidades.Reserva;
import br.com.hpviagens.services.ReservaService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/reserva")
public class ReservaController {

	@Autowired
	private ReservaService rService;
	
	@GetMapping
	public List<Reserva> reservaAll(){
		
		return rService.reservaAll();
	}
	
	@PostMapping("/salvarReserva")
	public void salvar(@RequestBody ReservaDTO reserva) {
		
		rService.saveReserva(reserva);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Reserva> getReservaById(@PathVariable Long id) {
		Reserva reserva = rService.listReservaById(id);

		return ResponseEntity.ok(reserva);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Reserva> updateReserva(@RequestBody ReservaDTO reservaUpdate, @PathVariable Long id) {
		Reserva reserva = rService.listReservaById(id);
		rService.updateReserva(reservaUpdate, id);

		return ResponseEntity.ok(reserva);
	}
	
	@DeleteMapping("/{id}")
	public void deleteReserva(@PathVariable Long id) {
		rService.deleteById(id);
	}
}
