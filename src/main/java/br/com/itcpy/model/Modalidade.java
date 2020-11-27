package br.com.itcpy.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Modalidade {

	private String tipo;
	private int taxa;

}
