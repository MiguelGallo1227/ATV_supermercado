package com.supermercado.mvc.controller;

import com.supermercado.mvc.banco.BancoDeProdutos;
import com.supermercado.mvc.model.Produto;

import java.util.List;

public class ProdutoController {

    BancoDeProdutos bp = new BancoDeProdutos();

    public List<Produto> getAllProdutos() {
        return bp.findAll();
    }

    public Boolean save(Produto p) {
        bp.insert(p);
        return true;
    }
    public void update(Produto p) {
        bp.update(p);
    }
    public void delete(Produto p) {
        bp.delete(p.getIdProduto());
    }
}
