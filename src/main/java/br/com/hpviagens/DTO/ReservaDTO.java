package br.com.hpviagens.DTO;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public class ReservaDTO {
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate dataReserva;
	
	private Long clienteId;
	private Long pagamentoId;
	private Long viagemId;
	
	public LocalDate getDataReserva() {
		return dataReserva;
	}
	public void setDataReserva(LocalDate dataReserva) {
		this.dataReserva = dataReserva;
	}
	public Long getClienteId() {
		return clienteId;
	}
	public void setClienteId(Long clienteId) {
		this.clienteId = clienteId;
	}
	public Long getPagamentoId() {
		return pagamentoId;
	}
	public void setPagamentoId(Long pagamentoId) {
		this.pagamentoId = pagamentoId;
	}
	public Long getViagemId() {
		return viagemId;
	}
	public void setViagemId(Long viagemId) {
		this.viagemId = viagemId;
	}
	
	
	
}
