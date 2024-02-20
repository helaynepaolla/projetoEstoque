package com.projetoEstoqueController;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.projetoEstoqueBody.DadosEstoque;
import com.projetoEstoqueService.EstoqueService;
import com.ptojetoEstoqueRepository.EstoqueRepository;



@RestController
@RequestMapping("/api/estoque")

public class EstoqueController {
	private final EstoqueRepository estoqueRepository;
	private final EstoqueService estoqueService;
	
	public EstoqueController(EstoqueService estoqueService) {
        this.estoqueRepository = null;
		this.estoqueService = estoqueService;
    }
	
    public EstoqueController(EstoqueRepository estoqueRepository) {
        this.estoqueRepository = estoqueRepository;
		this.estoqueService = null;
    }

    @PostMapping("/gravar")
    public ResponseEntity<String> gravarInformacoes(@RequestBody DadosEstoque dados) {
        // Aqui você pode validar os dados, manipular as informações se necessário e persistir no banco de dados usando o repositório
        estoqueRepository.save(dados);

        return ResponseEntity.ok("Informações gravadas com sucesso");
    }
    
    @GetMapping("/listar")
    public ResponseEntity<List<DadosEstoque>> listarInformacoes(@RequestParam int pagina, @RequestParam int tamanhoPagina) {
        // Chame o serviço para obter informações do banco de dados
  //      List<DadosEstoque> dados = estoqueService.listarInformacoesPaginadas(pagina, tamanhoPagina);
        
        return ResponseEntity.ok(dados);
    }

}
