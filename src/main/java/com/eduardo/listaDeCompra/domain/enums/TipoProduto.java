package com.eduardo.listaDeCompra.domain.enums;

public enum TipoProduto {

	HIGIENE(0, "ROLE_HIGIENE"), LIMPEZA(1, "ROLE_LIMPEZA"), ACOUGUE(2, "ROLE_ACOUGUE"), SACOLAO(3, "ROLE_SACOLAO"), OUTROS(4, "ROLE_OUTROS");

	private Integer codigo;
	private String descricao;
	
	private TipoProduto(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static TipoProduto toEnum(Integer cod) {
		if(cod == null ) {
			return null;
		}
		
		for (TipoProduto x : TipoProduto.values()) {
			if(cod.equals(x.getCodigo())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Item produto inválido");
	}
}
