package com.supermercado.mvc.view;

import com.supermercado.mvc.controller.CompraController;
import com.supermercado.mvc.model.Compra;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CompraView {
    CompraController cct = new CompraController();

    @GetMapping("/compra")
    public List<Compra> getAllCompras(){
        return cct.getAllCompras();
    }
    @PostMapping("/compra")
    public Boolean postVendas(@RequestBody Compra cc){
        return cct.save(cc);
    }
    @PutMapping("/compra")
    public String putCompra(@RequestBody Compra cc){
        cct.update(cc);
        return "update concluido com sucesso";
    }
    @DeleteMapping("deleteCompra")
    public String deleteCOmpra(@RequestBody Compra cc){
        cct.delete(cc);
        return "dexcluido com sucesso";
    }

}
