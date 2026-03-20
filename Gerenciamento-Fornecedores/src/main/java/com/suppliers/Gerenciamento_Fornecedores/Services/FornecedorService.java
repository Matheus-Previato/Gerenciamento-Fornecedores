package com.suppliers.Gerenciamento_Fornecedores.Services;

import com.suppliers.Gerenciamento_Fornecedores.Models.FornecedorModel;
import com.suppliers.Gerenciamento_Fornecedores.Repositories.FornecedorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FornecedorService {

    private final FornecedorRepository repository;

    public FornecedorService(FornecedorRepository repository) {
        this.repository = repository;
    }

    public FornecedorModel salvar(FornecedorModel fornecedor) {
        return repository.save(fornecedor);
    }

    public List<FornecedorModel> listarTodos() {
        return repository.findAll();
    }

    public Optional<FornecedorModel> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}