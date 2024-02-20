package com.projetoEstoqueService;

import java.awt.print.Pageable;
import java.util.List;

import org.hibernate.query.Page;
import org.springframework.stereotype.Service;

import com.ptojetoEstoqueRepository.EstoqueRepository;

@Service
public class EstoqueService {
	
	private final EstoqueRepository estoqueRepository;

    public EstoqueService(EstoqueRepository estoqueRepository) {
        this.estoqueRepository = estoqueRepository;
    }

    public List<DadosEstoque> listarInformacoesPaginadas(int pagina, int tamanhoPagina) {
        Pageable pageable = PageRequest.of(pagina, tamanhoPagina); // Criação da informação de paginação

        Page<DadosEstoque> dados = estoqueRepository.findAll(pageable); // Consulta paginada ao banco de dados

        return dados.getContent(); // Retorna os dados da página consultada
    }

}
