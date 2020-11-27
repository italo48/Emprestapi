package br.com.itcpy.model;

import br.com.itcpy.model.interfaces.Emprestimo;
import lombok.Data;

@Data
public class EmprestimoConsignado implements Emprestimo {

	private String nome;
	private int taxaJuros;

	public EmprestimoConsignado() {
		this.nome = "Consignado";
		this.taxaJuros = 2;
	}

	@Override
	public boolean concesscao(Cliente cliente) {
		return cliente.getSalario() >= 5000;
	}

}
