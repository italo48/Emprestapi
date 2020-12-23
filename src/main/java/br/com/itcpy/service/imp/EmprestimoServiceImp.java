package br.com.itcpy.service.imp;

import br.com.itcpy.model.*;
import br.com.itcpy.service.EmprestimoService;
import org.springframework.stereotype.Service;

@Service
public class EmprestimoServiceImp implements EmprestimoService {

	@Override
	public void adicionaModalidade(Cliente cliente) {
		EmprestimoComGarantia garantia = new EmprestimoComGarantia();
		EmprestimoConsignado consignado = new EmprestimoConsignado();
		
//		Regra de negocio. Por default todos os clientes tem direito ao emprestimo pessoal
		EmprestimoPessoal emp = new EmprestimoPessoal();
		cliente.getModalidades().add(new Modalidade(emp.getNome(), emp.getTaxaJuros()));

		if (garantia.concesscao(cliente)) {
			cliente.getModalidades().add(new Modalidade(garantia.getNome(), garantia.getTaxaJuros()));
		}
		if (consignado.concesscao(cliente)) {
			cliente.getModalidades().add(new Modalidade(consignado.getNome(), consignado.getTaxaJuros()));
		}
	}

}
