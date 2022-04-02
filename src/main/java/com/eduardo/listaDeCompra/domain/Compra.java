package com.eduardo.listaDeCompra.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.eduardo.listaDeCompra.domain.enums.Status;

public class Compra {

	private Status status;
	private Estabelecimento estabelecimento;
	private LocalDate dataCompra = LocalDate.now();
	// ItensCompra vai ser um array de inteiros e esses inteiros representam os id dos itens.
	private List<ItemCompra> itensCompra = new ArrayList<>();
	
	public Compra(Status status, Estabelecimento estabelecimento, LocalDate dataCompra, List<ItemCompra> itensCompra) {
		super();
		this.status = status;
		this.estabelecimento = estabelecimento;
		this.dataCompra = dataCompra;
		this.itensCompra = itensCompra;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Estabelecimento getEstabelecimento() {
		return estabelecimento;
	}

	public void setEstabelecimento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

	public LocalDate getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(LocalDate dataCompra) {
		this.dataCompra = dataCompra;
	}
	// Ficar de olho nos get and set (aula 06)
	public List<ItemCompra>getItensCompra() {
		return itensCompra;
	}

	public void setItensCompra(List<ItemCompra> itensCompra) {
		this.itensCompra = itensCompra;
	}
}
