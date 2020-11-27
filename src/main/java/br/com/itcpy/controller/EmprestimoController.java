package br.com.itcpy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.itcpy.model.Cliente;
import br.com.itcpy.model.EmprestimoPessoal;
import br.com.itcpy.model.Modalidade;
import br.com.itcpy.model.ResultadoAvaliacao;
import br.com.itcpy.service.imp.EmprestimoServiceImp;

@RestController
public class EmprestimoController {
	
	@Autowired
	private EmprestimoServiceImp emprestimoService;

	@GetMapping("/")
	public ResponseEntity<String> hello() {
		return ResponseEntity.ok("Emprestapi V1");
	}

	@PostMapping("/v1/avaliar")
	public ResponseEntity<ResultadoAvaliacao> avaliarEmprestimo(@RequestBody Cliente cliente) {

//		Regra de negocio. Por default todos os clientes tem direito ao emprestimo pessoal
		EmprestimoPessoal emp = new EmprestimoPessoal();
		cliente.getModalidades().add(new Modalidade(emp.getNome(), emp.getTaxaJuros()));
		emprestimoService.adicionaModalidade(cliente);
		ResultadoAvaliacao result = new ResultadoAvaliacao(cliente.getNome(), cliente.getModalidades());
		return ResponseEntity.ok(result);
	}
}
