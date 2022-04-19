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

    @BeforeEach
    public void inicializa() {
        f = new Fatura("Kate", 7000.0,new Date(),false);
    }
    @Test
    public void testeGetNome() {
        String nome = f.getName();
        Assertions.assertEquals(nome, "Kate");
    }
    

}