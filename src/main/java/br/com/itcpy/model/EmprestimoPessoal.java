package br.com.itcpy.model;

import br.com.itcpy.model.interfaces.Emprestimo;
import lombok.Data;

@Data
public class EmprestimoPessoal implements Emprestimo {
	private String nome;
	private int taxaJuros;

	public EmprestimoPessoal() {
		this.nome = "Pessoal";
		this.taxaJuros = 4;
	}

	@Override
	public boolean concesscao(Cliente cliente) {
		return true;
	}

}
