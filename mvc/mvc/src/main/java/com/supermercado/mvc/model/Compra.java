package com.supermercado.mvc.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Compra {
    private int id;
    private Fornecedor fornecedor;
    private Date dataCompra;
    private double valorCompra;
}
