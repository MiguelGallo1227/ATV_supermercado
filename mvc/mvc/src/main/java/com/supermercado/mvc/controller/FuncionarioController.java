package com.supermercado.mvc.controller;

import com.supermercado.mvc.banco.BancoDeFuncionario;
import com.supermercado.mvc.model.Funcionario;

import java.util.List;

public class FuncionarioController {
    BancoDeFuncionario bf = new BancoDeFuncionario();
    public List<Funcionario> getAllFuncionarios() {
        return bf.findAll();
    }

    public Boolean save(Funcionario fu) {
        bf.insert(fu);
        return true;
    }
    public void update(Funcionario f) {
        bf.update(f);
    }
    public void delete(Funcionario f) {
        bf.delete(f.getIdFuncionario());
    }
}
