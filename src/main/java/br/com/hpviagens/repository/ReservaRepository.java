package br.com.hpviagens.repository;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.hpviagens.entidades.Reserva;
import jakarta.transaction.Transactional;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {

	@Transactional
	@Modifying
	@Query(nativeQuery = true, value = "INSERT INTO reserva (data_reserva, cliente_id_fk, viagem_id_fk, pagamento_id_fk) "
			+ " VALUES (:dataReserva, :clienteId, :viagemId, :pagamentoId)")
	void saveReserva(@Param("dataReserva") LocalDate dataReserva, @Param("clienteId") Long clienteId, 
			@Param("viagemId")Long viagemId,
			@Param("pagamentoId") Long pagamentoId);
	
	
	@Transactional
	@Modifying
	@Query(nativeQuery = true, value = "UPDATE reserva SET "
			+ "data_reserva = :dataReserva, cliente_id_fk = :clienteId,"
			+ " viagem_id_fk = :viagemId, pagamento_id_fk = :pagamentoId "
			+ " WHERE id = :id")
	void updateReserva(@Param("dataReserva") LocalDate dataReserva, 
			@Param("clienteId") Long clienteId, 
			@Param("viagemId")Long viagemId,
			@Param("pagamentoId") Long pagamentoId,
			@Param("id") Long id);

}
