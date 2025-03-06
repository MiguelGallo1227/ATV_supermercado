package com.supermercado.mvc.banco;

import com.supermercado.mvc.model.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class BancoDeFuncionario {
    private List<Funcionario> funcionarios;

    public BancoDeFuncionario() {
        this.funcionarios = new ArrayList<>();
    }

    // Insere um novo produto na lista
    public void insert(Funcionario f) {
        funcionarios.add(f);
    }

    // Busca um produto pelo ID
    public Funcionario findOne(int id) {
        for (Funcionario f : funcionarios) {
            if (f.getIdFuncionario() == id) {
                return f;
            }
        }
        return null; // Retorna null se não encontrar
    }

    // Retorna todos os produtos cadastrados
    public List<Funcionario> findAll() {
        return new ArrayList<>(funcionarios);
    }

    // Atualiza um produto existente na lista
    public boolean update(Funcionario f) {
        for (int i = 0; i < funcionarios.size(); i++) {
            if (funcionarios.get(i).getIdFuncionario() == f.getIdFuncionario()) {
                funcionarios.set(i, f);
                return true; // Retorno indicando que a atualização foi feita
            }
        }
        return false; // Retorna falso se o produto não foi encontrado
    }

    // Remove um produto pelo ID
    public boolean delete(int id) {
        return funcionarios.removeIf(f -> f.getIdFuncionario() == id);
    }
}