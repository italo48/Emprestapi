package br.com.itcpy.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.itcpy.model.Cliente;
import br.com.itcpy.model.EmprestimoPessoal;
import br.com.itcpy.model.Modalidade;
import br.com.itcpy.model.ResultadoAvaliacao;

@RestController
public class EmprestimoController {

	@GetMapping("/")
	public ResponseEntity<String> hello() {
		return ResponseEntity.ok("asd");
	}

	@GetMapping("/avaliacao")
	public ResponseEntity<ResultadoAvaliacao> avaliacaoEmprestimo() {
		Cliente cliente = new Cliente();
		cliente.setNome("Italo");
		EmprestimoPessoal pessoal = new EmprestimoPessoal();
		cliente.getModalidades().add(new Modalidade("Pessoal", pessoal.getTaxaJuros()));
		ResultadoAvaliacao result = new ResultadoAvaliacao(cliente.getNome(), cliente.getModalidades());

		return ResponseEntity.ok(result);
	}
}
