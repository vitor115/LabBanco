/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.emprestimobanco;

/**
 *
 * @author Vitor Ravacci - 31817750
 * @author Pedro Joanini - 31852238
 */
public class Banco {
    public boolean avalia_cliente(int saldo, boolean historico, boolean concessao) {
        if(saldo<1000 && historico == false && concessao == false){
            return false;
        }
        else {
            return true;
        }
    }
}
