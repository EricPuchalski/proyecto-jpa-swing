package org.example.service;

import org.example.model.Cliente;
import org.example.model.Deposito;
import org.example.model.Sector;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.example.dao.DepositoJpaController;
import org.example.dao.exceptions.NonexistentEntityException;

public class DepositoService{
    private DepositoJpaController depositoJpaController;

    public DepositoService(DepositoJpaController depositoJpaController) {
        this.depositoJpaController = depositoJpaController;
    }

    public void save(Deposito deposito) {
        depositoJpaController.create(deposito);
    }

    public List<Deposito> findAll() {
       return depositoJpaController.findDepositoEntities();
    }


    public Deposito findOne(Long id) {
        return depositoJpaController.findDeposito(id);
    }


    public void upDate(Deposito deposito) {
        try {
            depositoJpaController.edit(deposito);
        } catch (Exception ex) {
            Logger.getLogger(DepositoService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void delete(Long id) {
        try {
            depositoJpaController.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(DepositoService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
