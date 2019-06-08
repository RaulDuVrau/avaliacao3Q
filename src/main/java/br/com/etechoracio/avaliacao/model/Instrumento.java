package br.com.etechoracio.avaliacao.model;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import br.com.etechoracio.avaliacao.enums.TipoInstrumentoEnum;

public class Instrumento {

	@Id
	@GeneratedValue
	@Column(name = "instrumento")
	private String instrumento;

	@Column(name = "tipo")
	@Enumerated(EnumType.STRING)
	private TipoInstrumentoEnum tipo;

	@Column(name = "marca")
	private String marca;

	@Column(name = "preco")
	private int preco;
}
