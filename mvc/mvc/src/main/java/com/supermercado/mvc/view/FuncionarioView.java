package com.supermercado.mvc.view;

import com.supermercado.mvc.controller.FuncionarioController;
import com.supermercado.mvc.model.Cliente;
import com.supermercado.mvc.model.Funcionario;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FuncionarioView {
    FuncionarioController ft = new FuncionarioController();

    @GetMapping("/funcionario")
    public List<Funcionario> getAllFuncionarios() {
        return ft.getAllFuncionarios();
    }

    @PostMapping("/funcionario")
    public Boolean postFuncionario(@RequestBody Funcionario f){
        return ft.save(f);
    }
    @PutMapping("/funcionario")
    public String putFuncionario(@RequestBody Funcionario f){
        ft.update(f);
        return "update concluido com sucesso";
    }
    @DeleteMapping("deleteFuncionario")
    public String deleteFuncionario(@RequestBody Funcionario f){
        ft.delete(f);
        return "excluido com sucesso";
    }
}
