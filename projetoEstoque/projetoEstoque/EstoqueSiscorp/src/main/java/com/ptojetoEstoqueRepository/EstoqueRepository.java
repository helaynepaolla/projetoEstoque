package com.ptojetoEstoqueRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetoEstoqueEntity.Produto;



@Repository
public interface EstoqueRepository extends JpaRepository<Produto, Long> {
    // Outros métodos de consulta personalizados podem ser declarados aqui, se necessário

}
