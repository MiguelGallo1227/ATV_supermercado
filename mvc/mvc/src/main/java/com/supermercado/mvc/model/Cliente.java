package com.supermercado.mvc.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Cliente {
    private int id;
    private String nome;
    private String cpf;
    private List<Date> datasCompras;
    private List<Double> valoresCompras;
}
