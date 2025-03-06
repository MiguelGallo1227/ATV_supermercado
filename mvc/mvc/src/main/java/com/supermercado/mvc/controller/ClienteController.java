package com.supermercado.mvc.controller;

import com.supermercado.mvc.model.Cliente;
import com.supermercado.mvc.model.Cliente;

import java.util.List;

public class ClienteController {

    BancoDeClientes bc = new BancoDeClientes();
    public List<Cliente> getAllClientes() {
        return bc.findAll();
    }

    public Boolean save(Cliente c) {
        bc.insert(c);
        return true;
    }
    public void update(Cliente c) {
        bc.update(c);
    }
    public void delete(Cliente c) {
        bc.delete(c.getIdCliente());
    }
}
