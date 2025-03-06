package com.supermercado.mvc.controller;

import com.supermercado.mvc.banco.BancoDeClientes;
import com.supermercado.mvc.banco.BancoDeProdutos;
import com.supermercado.mvc.banco.BancoDeVendas;
import com.supermercado.mvc.banco.BancoDeFuncionario;
import com.supermercado.mvc.model.Cliente;
import com.supermercado.mvc.model.Produto;
import com.supermercado.mvc.model.Venda;
import com.supermercado.mvc.model.Funcionario;

import java.util.List;

public class VendaController {
    BancoDeVendas bcoVendas = new BancoDeVendas();
    BancoDeClientes bcoClientes = new BancoDeClientes();
    BancoDeProdutos bcoProdutos = new BancoDeProdutos();
    BancoDeFuncionario bcoFuncionarios = new BancoDeFuncionario(); // Adicionando banco de funcionários

    public List<Venda> getAllVendas() {
        return bcoVendas.findAll();
    }

    public Boolean save(Venda v) {
        Cliente clienteEnviado = v.getCliente();
        List<Produto> produtosEnviados = v.getProduto();
        Funcionario funcionarioEnviado = v.getFuncionario();

        // Verifica se o cliente está cadastrado
        if (bcoClientes.findOne(clienteEnviado.getIdCliente()) == null) {
            return false;
        }

        // Verifica se o funcionário está cadastrado
        if (bcoFuncionarios.findOne(funcionarioEnviado.getIdFuncionario()) == null) {
            return false;
        }

        // Verifica se os produtos enviados estão cadastrados
        for (Produto p : produtosEnviados) {
            if (bcoProdutos.findOne(p.getIdProduto()) == null) {
                return false;
            }
        }

        bcoVendas.insert(v);
        return true;
    }

    public void update(Venda v) {
        bcoVendas.update(v);
    }

    public void delete(Venda v) {
        bcoVendas.delete(v.getIdVenda());
    }
}