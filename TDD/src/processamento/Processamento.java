package processamento;

import java.util.Date;

import boleto.Boleto;
import fatura.Fatura;
import pagamento.Pagamento;

public  class Processamento {
	
	private Boleto [] b;
	private Fatura f; 
	private Pagamento [] p;
	
	
	public  Processamento (Boleto[] b, Fatura f) {
		super();
		this.b=b;
		this.f=f;	
		
	}
	
	
		

}


