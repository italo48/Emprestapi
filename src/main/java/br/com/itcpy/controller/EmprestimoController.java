package br.com.itcpy.controller;

import br.com.itcpy.model.Cliente;
import br.com.itcpy.model.ResultadoAvaliacao;
import br.com.itcpy.service.imp.EmprestimoServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class EmprestimoController {

	@Autowired
	private EmprestimoServiceImp emprestimoService;

	@GetMapping("/")
	public ResponseEntity<String> hello() {
		return ResponseEntity.ok("Emprestapi V1");
	}

	@PostMapping("/avaliar")
	public ResponseEntity<ResultadoAvaliacao> avaliarEmprestimo(@RequestBody Cliente cliente) {

		emprestimoService.adicionaModalidade(cliente);

		ResultadoAvaliacao result = new ResultadoAvaliacao(cliente.getNome(), cliente.getModalidades());
		return ResponseEntity.ok(result);
	}
}
