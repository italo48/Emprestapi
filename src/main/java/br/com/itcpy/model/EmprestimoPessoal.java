package br.com.itcpy.model;

import br.com.itcpy.model.interfaces.Emprestimo;
import lombok.Data;

@Data
public class EmprestimoPessoal implements Emprestimo {
	private int taxaJuros;

	public EmprestimoPessoal() {
		this.taxaJuros = 4;
	}

	@Override
	public boolean concesscao(Cliente cliente) {
		// TODO Auto-generated method stub
		return false;
	}

}
