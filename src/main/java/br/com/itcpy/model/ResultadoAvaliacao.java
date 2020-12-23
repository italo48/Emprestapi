package br.com.itcpy.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class ResultadoAvaliacao {

	private String cliente;
	private List<Modalidade> modalidades;
}
