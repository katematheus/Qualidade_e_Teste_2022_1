package processatest;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
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
    ArrayList<Boleto>  bolets;
    Date emissao;
    Fatura fat;
    ArrayList<Pagamento> pay;
    Processamento proc;
    
    @BeforeEach
    public void inicializa() {
    	bolets= new ArrayList<Boleto>();
    	pay = new ArrayList<Pagamento>();
    	emissao=new Date();
    	b1=new Boleto (emissao,123,500);
    	b2=new Boleto (emissao,456,600);
    	b3=new Boleto (emissao,789,400);
        fat= new Fatura("Paulo",1500.00,emissao);
        bolets.add(b1);
        bolets.add(b2);
        bolets.add(b3);
        proc= new Processamento(bolets, fat,pay);
        
        
    }
  @Test
    public void testeAddBol(){
	 
        double soma = proc.SomaBol();
	 
        Assertions.assertEquals(soma,1500.00 );
  }
  @Test
  public void testeAlteraStatusFat(){
	  proc.alteraStatusFat(); 
     boolean stts = fat.getStatus();
	 
      Assertions.assertEquals(stts,true);
}
  @Test
  public void testeAdicionaPagamento(){
	  proc.criaPag();
	  int qtdpag= proc.qtdpag();
	  
      Assertions.assertEquals(qtdpag,3);
}
    
    

}