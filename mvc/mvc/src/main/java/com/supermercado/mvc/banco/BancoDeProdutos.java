package com.supermercado.mvc.banco;

import com.supermercado.mvc.model.Produto;
import java.util.ArrayList;
import java.util.List;

public class BancoDeProdutos {
    private List<Produto> produtos;

    public BancoDeProdutos() {
        this.produtos = new ArrayList<>();
    }


    public void insert(Produto p) {
        p.atualizarDisponibilidade();
        produtos.add(p);
    }

    // Busca um produto pelo ID
    public Produto findOne(int id) {
        for (Produto p : produtos) {
            if (p.getIdProduto().equals(id)) {
                return p;
            }
        }
        return null; // Retorna null se não encontrar
    }

    // Retorna todos os produtos cadastrados
    public List<Produto> findAll() {
        return new ArrayList<>(produtos);
    }

    // Atualiza um produto existente na lista e ajusta sua disponibilidade
    public boolean update(Produto p) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getIdProduto().equals(p.getIdProduto())) {
                p.atualizarDisponibilidade();
                produtos.set(i, p);
                return true; // Retorno indicando que a atualização foi feita
            }
        }
        return false; // Retorna falso se o produto não foi encontrado
    }

    // Remove um produto pelo ID
    public boolean delete(int id) {
        return produtos.removeIf(p -> p.getIdProduto().equals(id));
    }
}
