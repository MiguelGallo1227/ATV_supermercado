package com.supermercado.mvc.view;

import com.supermercado.mvc.controller.VendaController;
import com.supermercado.mvc.model.Venda;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VendaView {

    VendaController vt = new VendaController();

    @GetMapping("/venda")
    public List<Venda> getAllVendas(){
        return vt.getAllVendas();
    }

    @PostMapping("/venda")
    public Boolean postVendas(@RequestBody Venda v){
        return vt.save(v);
    }
    @PutMapping("/venda")
    public String putCliente(@RequestBody Venda v){
        vt.update(v);
        return "update concluido com sucesso";
    }
    @DeleteMapping("deleteVenda")
    public String deleteCliente(@RequestBody Venda v){
        vt.delete(v);
        return "delete concluido com sucesso";
    }
}
