package processamento;

import java.util.ArrayList;
import java.util.Date;

import boleto.Boleto;
import fatura.Fatura;
import pagamento.Pagamento;

public  class Processamento {
	
	private ArrayList<Boleto> b;
	private Fatura f; 
	private Pagamento [] p;
	
	
	public  Processamento (ArrayList<Boleto> b, Fatura f) {
		super();
		this.b=b;
		this.f=f;	
		
	}
	
	public double SomaBol(){
      double soma=0;
        
       for(int i=0;i<b.size();i++) {
    	  Boleto bol=b.get(i);
    	  soma+= bol.getPago();
        }
       return soma;
	}
	
	
	
}

