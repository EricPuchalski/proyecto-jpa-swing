package org.example.controller;

import org.example.model.Deposito;
import org.example.service.DepositoService;

import java.util.List;

public class DepositoController{
    private DepositoService depositoService;

    public DepositoController(DepositoService depositoService) {
        this.depositoService = depositoService;
    }
 

    public void create(Deposito deposito) {
        depositoService.save(deposito);
    }


    public Deposito findOne(Long id) {
        return depositoService.findOne(id);
    }


    public List<Deposito> findAll() {
        return depositoService.findAll();
    }


    public void upDate(Deposito deposito) {
        depositoService.upDate(deposito);

    }


    public void delete(Long id) {
        depositoService.delete(id);
    }
}
