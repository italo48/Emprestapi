package br.com.itcpy.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResultadoAvaliacao {

	private String cliente;
	private List<Modalidade> modalidades;
}
