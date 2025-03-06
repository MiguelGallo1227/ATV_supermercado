package com.supermercado.mvc.controller;

import com.supermercado.mvc.banco.BancoDeCompras;
import com.supermercado.mvc.model.Compra;
import com.supermercado.mvc.model.Fornecedor;
import com.supermercado.mvc.model.Produto;

import java.util.List;

public class CompraController {
    BancoDeCompras bcdc = new BancoDeCompras();

    // Retorna todas as compras
    public List<Compra> getAllCompras() {
        return bcdc.findAll();
    }

    // Salva uma nova compra
    public Boolean save(Compra c) {
        // Aqui pode haver verificações sobre fornecedor e produtos, como no exemplo da venda
        bcdc.insert(c);
        return true;
    }
    public void update(Compra c) {
        bcdc.update(c);
    }
    public void delete(Compra c) {
        bcdc.delete(c.getIdCompra());
    }
}
