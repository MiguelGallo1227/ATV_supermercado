package com.supermercado.mvc.banco;

import com.supermercado.mvc.model.Venda;

import java.util.ArrayList;
import java.util.List;

public class BancoDeVendas {
    private List<Venda> venda;

    public BancoDeVendas() {
        this.venda = new ArrayList<>();
    }

    public void insert(Venda v) {
        venda.add(v);
    }

    public Venda findOne(int id) {
        for (Venda v : venda) {
            if (v.getIdVenda().equals(id)) {
                return v;
            }
        }
        return null;
    }

    public List<Venda> findAll() {
        return new ArrayList<>(venda);
    }

    public boolean update(Venda v) {
        for (int i = 0; i < venda.size(); i++) {
            if (venda.get(i).getIdVenda().equals(v.getIdVenda())) {
                venda.set(i, v);
                return true;
            }
        }
        return false;
    }

    public boolean delete(int id) {
        return venda.removeIf(v -> v.getIdVenda().equals(id));
    }
}
