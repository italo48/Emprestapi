package br.com.itcpy.service.imp;

import org.springframework.stereotype.Service;

import br.com.itcpy.model.Cliente;
import br.com.itcpy.model.EmprestimoComGarantia;
import br.com.itcpy.model.EmprestimoConsignado;
import br.com.itcpy.model.Modalidade;
import br.com.itcpy.service.EmprestimoService;

@Service
public class EmprestimoServiceImp implements EmprestimoService {

	@Override
	public void adicionaModalidade(Cliente cliente) {
		EmprestimoComGarantia garantia = new EmprestimoComGarantia();
		EmprestimoConsignado consignado = new EmprestimoConsignado();

		if (garantia.concesscao(cliente)) {
			cliente.getModalidades().add(new Modalidade(garantia.getNome(), garantia.getTaxaJuros()));
		}
		if (consignado.concesscao(cliente)) {
			cliente.getModalidades().add(new Modalidade(consignado.getNome(), consignado.getTaxaJuros()));
		}
	}

}
