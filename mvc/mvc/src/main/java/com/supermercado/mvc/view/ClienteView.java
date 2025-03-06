package com.supermercado.mvc.view;

import com.supermercado.mvc.controller.ClienteController;
import com.supermercado.mvc.model.Cliente;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClienteView {

    ClienteController ct = new ClienteController();

    @GetMapping("/cliente")
    public List<Cliente> getAllClientes(){
        return ct.getAllClientes();
    }

    @PostMapping("/cliente")
    public Boolean postCliente(@RequestBody Cliente c){
        return ct.save(c);
    }
    @PutMapping("/cliente")
    public String putCliente(@RequestBody Cliente c){
        ct.update(c);
        return "update concluido com sucesso";
    }
    @DeleteMapping("deleteCliente")
    public String deleteCliente(@RequestBody Cliente c){
        ct.delete(c);
        return "excluido com sucesso";
    }
}