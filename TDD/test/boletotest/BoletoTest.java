package boletotest;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import boleto.Boleto;


@DisplayName("Testes de Boleto")
public class BoletoTest {

    Boleto b;
    Date emissao;
    
    @BeforeEach
    public void inicializa() {
        emissao= new Date();
        b = new Boleto(emissao,123456789,1500.00);
    }
   
    @Test
    public void testeGetData() {
        Date d = b.getData();
        Assertions.assertEquals(d,emissao);
    }
    
    @Test
    public void testeGetCodigo() {
        long c = b.getCod();
        Assertions.assertEquals(c,123456789);
    }
    
    @Test
    public void testeGetPago() {
        double p = b.getPago();
        Assertions.assertEquals(p,1500.00);
    }
    
    

}