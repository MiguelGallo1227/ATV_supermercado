package com.supermercado.mvc.view;

import com.supermercado.mvc.controller.ProdutoController;
import com.supermercado.mvc.model.Cliente;
import com.supermercado.mvc.model.Produto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProdutoView {

    ProdutoController pt = new ProdutoController();

    @GetMapping("/produto")
    public List<Produto> getAllProdutos(){
        return pt.getAllProdutos();
    }

    @PostMapping("/produto")
    public Boolean postProduto(@RequestBody Produto p){
        return pt.save(p);
    }
    @PutMapping("/produto")
    public String putCliente(@RequestBody Produto p){
        pt.update(p);
        return "Atualização concluida com sucesso";
    }
    @DeleteMapping("deleteProduto")
    public String deleteCliente(@RequestBody Produto p){
        pt.delete(p);
        return "excluido com sucesso";
    }
}