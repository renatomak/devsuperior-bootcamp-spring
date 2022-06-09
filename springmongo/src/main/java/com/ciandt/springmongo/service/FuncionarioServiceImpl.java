package com.ciandt.springmongo.service;

import com.ciandt.springmongo.model.Funcionario;
import com.ciandt.springmongo.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioServiceImpl implements FuncionarioService{

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @Override
    public List<Funcionario> obterTodos() {
        return funcionarioRepository.findAll();
    }

    @Override
    public Funcionario obterPorCodigo(String codigo) {
        return funcionarioRepository.findById(codigo)
                .orElseThrow(() -> new IllegalArgumentException("Funcionário não existe"));
    }

    @Override
    public Funcionario criar(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }
}
