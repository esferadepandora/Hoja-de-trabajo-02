/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author EsferaDePandora
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setString method, of class Calculadora.
     */
    @Test
    public void testSetString() {
        String linea = "1 z 3";
        Calculadora calculadotaT = new Calculadora();
        calculadoraT.setString(linea);
        calculadoraT.meterVector();
        boolean result = calculadoraT.calcularVEctor();
        int resultado0 = calculadoraT.getResultado();
        int resultadoE = 33;
        boolean expResultado = false;
        
        System.out.println("Buleano que se espera: "+expResultado);
        System.out.println("Buleano que se espera: "+result);
        assertEquals(expResultado, result);
        
        if (result==true){
            System.out.println("Resultado esperado: "+resultadoE);
            System.out.println("Resultado obtenido: "+result);
            assertEquals(resultadoE, resultado0);
        }
    }

    /**
     * Test of meterVector method, of class Calculadora.
     */
    @Test
    public void testMeterVector() {
        System.out.println("meterVector");
        Calculadora instance = new Calculadora();
        instance.meterVector();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of calcularVector method, of class Calculadora.
     */
    @Test
    public void testCalcularVector() {
        System.out.println("calcularVector");
        Calculadora instance = new Calculadora();
        boolean expResult = false;
        boolean result = instance.calcularVector();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getResultado method, of class Calculadora.
     */
    @Test
    public void testGetResultado() {
        System.out.println("getResultado");
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.getResultado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
