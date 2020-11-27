package br.com.itcpy.model;

import br.com.itcpy.model.interfaces.Emprestimo;
import lombok.Data;

@Data
public class EmprestimoComGarantia implements Emprestimo {

	private int taxaJuros;

	public EmprestimoComGarantia() {
		this.taxaJuros = 3;
	}

	@Override
	public boolean concesscao(Cliente cliente) {
		return true;
	}

}
