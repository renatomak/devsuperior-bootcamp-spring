package com.ciandt.springmongo.controller;

import com.ciandt.springmongo.model.Funcionario;
import com.ciandt.springmongo.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    @GetMapping
    public List<Funcionario> obterTodos() {
        return funcionarioService.obterTodos();
    }

    @GetMapping("/{codigo}")
    public Funcionario obterPorcodigo(@PathVariable String codigo) {
        return this.funcionarioService.obterPorCodigo(codigo);
    }

    @PostMapping
    public Funcionario criar(@RequestBody Funcionario funcionario) {
        return funcionarioService.criar(funcionario);
    }
}
