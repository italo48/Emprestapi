package br.com.itcpy.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Cliente {

	private Long id;
	private String nome;
	private String cpf;
	private int idade;
	private char[] uf = new char[2];
	private float salario;
	private List<Modalidade> modalidades;

	public Cliente() {
		this.modalidades = new ArrayList<>();
	}

}
