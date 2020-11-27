package br.com.itcpy.model;

import br.com.itcpy.model.interfaces.Emprestimo;
import lombok.Data;

@Data
public class EmprestimoConsignado implements Emprestimo {

	private int taxaJuros;

	public EmprestimoConsignado() {
		this.taxaJuros = 2;
	}

	@Override
	public boolean concesscao(Cliente cliente) {
		// TODO Auto-generated method stub
		return false;
	}

}
