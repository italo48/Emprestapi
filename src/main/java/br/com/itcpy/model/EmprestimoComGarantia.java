package br.com.itcpy.model;

import br.com.itcpy.model.interfaces.Emprestimo;
import lombok.Data;

@Data
public class EmprestimoComGarantia implements Emprestimo {

	private String nome;
	private int taxaJuros;

	public EmprestimoComGarantia() {
		this.nome = "Com Garantia";
		this.taxaJuros = 3;
	}

	@Override
	public boolean concesscao(Cliente cliente) {
		boolean idade = cliente.getIdade() < 30;
		boolean isCe = String.valueOf(cliente.getUf()).equals("CE");

		if ((cliente.getSalario() <= 3000 && idade && isCe)
				|| (cliente.getSalario() > 3000 && cliente.getSalario() < 5000 && isCe)
				|| (cliente.getSalario() >= 5000 && idade)) {
			return true;
		}	
		return false;
	}

}
