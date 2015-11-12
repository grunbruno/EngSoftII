/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import projeto.es2.imc.Pessoa;
import projeto.es2.imc.IMC;

/**
 *
 * @author Bruno Grun e Guilherme de Souza
 */
public class TesteIMC {
    
    public TesteIMC() {
    }
    
    @Test
    public void testeNumerosInvalidos(){
        Pessoa p = new Pessoa();
        p.setAltura(0.59);
        p.setPeso(90);
        p.setSexo('M');
        Assert.assertEquals(p.Mensagem(), "Valores Inválidos - Confira os Valores digitados");
    }
    
    @Test
    public void testeImcBaixo(){
        Pessoa p = new Pessoa();
        p.setPeso(50);
        p.setAltura(1.80);
        p.setSexo('f');
        Assert.assertEquals(p.Mensagem(), "Você está abaixo do peso recomendado.");
    }
    
    @Test
    public void testeImcIdealM(){
        Pessoa p = new Pessoa();
        p.setPeso(70);
        p.setAltura(1.80);
        p.setSexo('M');
        Assert.assertEquals(p.Mensagem(), "Você está muito bem! Continue assim!");
    }    
    
    @Test
    public void testeImcIdealF(){
        Pessoa p = new Pessoa();
        p.setPeso(60);
        p.setAltura(1.80);
        p.setSexo('f');
        Assert.assertEquals(p.Mensagem(), "Você está muito bem! Continue assim!");
    }
    
    @Test
    public void testeImcModerado(){
        Pessoa p = new Pessoa();
        p.setPeso(100);
        p.setAltura(2.00);
        p.setSexo('f');
        Assert.assertEquals(p.Mensagem(), "Você está acima do peso recomendado. Cuidado!");
    }
    
    @Test
    public void testeImcElevado(){
        Pessoa p = new Pessoa();
        p.setPeso(100);
        p.setAltura(1.70);
        p.setSexo('m');
        Assert.assertNotSame(p.Mensagem(),  "Você está muito bem! Continue assim!");
    }  
    
    @Test
    public void testeCalculoImc(){       
        double c = 50/Math.pow(1.80,2);
        Assert.assertEquals(c, 15,4);
    }
    
    @Test
    public void testeCalculoImc2(){       
        double c = 60/Math.pow(1.70,2);
        Assert.assertEquals(c, 20,7);
    }
    
   
}
