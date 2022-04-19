package processatest;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import boleto.Boleto;
import fatura.Fatura;
import pagamento.Pagamento;
import processamento.Processamento;


@DisplayName("Testes de Processamento")
public class ProcessaTest {

    Boleto b1,b2,b3;
    Boleto [] bolets= {b1,b2,b3};
    Date emissao;
    Fatura fat;
    Pagamento pay;
    Processamento proc;
    
    @BeforeEach
    public void inicializa() {
    	emissao=new Date();
    	b1=new Boleto (emissao,123,500);
    	b2=new Boleto (emissao,456,600);
    	b3=new Boleto (emissao,789,400);
        fat= new Fatura("Paulo",1500.00,emissao,false);
        proc= new Processamento(bolets, fat);
        
    }
  @Test
    public void testeSomaBol(){
        double soma=0;
        
       for(int i=0;i<bolets.length;i++) {
    	   
    	  soma+= bolets[i].getPago();
        }
        
        Assertions.assertEquals(soma,1500.00 );
  }
    
    

}