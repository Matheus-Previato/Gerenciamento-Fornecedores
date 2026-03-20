package com.suppliers.Gerenciamento_Fornecedores.Repositories;

import com.suppliers.Gerenciamento_Fornecedores.Models.FornecedorModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FornecedorRepository extends JpaRepository<FornecedorModel, Long> {
}