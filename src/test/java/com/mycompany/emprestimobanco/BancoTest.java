/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.emprestimobanco;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author vitor
 */
public class BancoTest {
    
    Banco banco;
    public BancoTest() {
      banco = new Banco();
    }
    @Test
    public void testValidaCliente() {
        System.out.println("TestValidaCliente");
        assertEquals(true, banco.avalia_cliente(1100, true, true));
        assertEquals(true, banco.avalia_cliente(1100, true, false));
        assertEquals(true, banco.avalia_cliente(1100, false, true));
        assertEquals(true, banco.avalia_cliente(1100, false, false));
        assertEquals(true, banco.avalia_cliente(500, true, true));
        assertEquals(true, banco.avalia_cliente(500, true, false));
        assertEquals(true, banco.avalia_cliente(500, false, true));
        assertNotEquals(true, banco.avalia_cliente(500, false, false));
        
    }
    
}
