package br.com.itcpy.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Cliente {

	private Long id;
	private String nome;
	private String cpf;
	private int idade;
	private char[] uf;
	private float salario;

	private List<Modalidade> modalidades;

//	Regra de negocio. Por default todos os clientes tem direito ao emprestimo pessoal
	public Cliente() {
		this.modalidades = new ArrayList<>();
	}

}
