package faturatest;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import fatura.Fatura;

@DisplayName("Testes da fatura")
public class FaturaTest {

    Fatura f;
    Date lancamento;
    
    @BeforeEach
    public void inicializa() {
        lancamento= new Date();
        f = new Fatura("Kate", 7000.0,lancamento,false);
    }
    @Test
    public void testeGetName() {
        String nome = f.getName();
        Assertions.assertEquals(nome, "Kate");
    }
    
    @Test
    public void testeGetValor() {
        double valor = f.getValor();
        Assertions.assertEquals(valor,7000.0);
    }
    
    @Test
    public void testeGetData() {
        Date d = f.getData();
        Assertions.assertEquals(d,lancamento);
    }
    
    @Test
    public void testeGetStatus() {
        boolean s = f.getStatus();
        Assertions.assertEquals(s,false);
    }
    

}