package com.supermercado.mvc.banco;

import com.supermercado.mvc.model.Compra;

import java.util.ArrayList;
import java.util.List;

public class BancoDeCompras {
    private List<Compra> compras;

    public BancoDeCompras() {
        this.compras = new ArrayList<>();
    }

    // Insere uma nova compra na lista
    public void insert(Compra c) {
        compras.add(c);
    }

    // Busca uma compra pelo ID
    public Compra findOne(int id) {
        for (Compra c : compras) {
            if (c.getIdCompra().equals(id)) {
                return c;
            }
        }
        return null; // Retorna null se não encontrar
    }

    // Retorna todas as compras cadastradas
    public List<Compra> findAll() {
        return new ArrayList<>(compras);
    }

    // Atualiza uma compra existente na lista
    public boolean update(Compra c) {
        for (int i = 0; i < compras.size(); i++) {
            if (compras.get(i).getIdCompra().equals(c.getIdCompra())) {
                compras.set(i, c);
                return true; // Retorno indicando que a atualização foi feita
            }
        }
        return false; // Retorna falso se a compra não foi encontrada
    }

    // Remove uma compra pelo ID
    public boolean delete(int id) {
        return compras.removeIf(c -> c.getIdCompra().equals(id));
    }
}

