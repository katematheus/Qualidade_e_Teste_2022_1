package processamento;

import java.util.ArrayList;
import java.util.Date;

import boleto.Boleto;
import fatura.Fatura;
import pagamento.Pagamento;

public  class Processamento {
	
	private ArrayList<Boleto> b;
	private Fatura f; 
	private ArrayList<Pagamento> p;
	
	
	public  Processamento (ArrayList<Boleto> b, Fatura f, ArrayList<Pagamento> p) {
		super();
		this.b=b;
		this.f=f;
		this.p=p;
		
	}
	
	public double SomaBol(){
      double soma=0;
        
       for(int i=0;i<b.size();i++) {
    	  Boleto bol=b.get(i);
    	  soma+= bol.getPago();
        }
       return soma;
	}
	
	public void  alteraStatusFat(){
		double soma = SomaBol();
		
		if(soma >= f.getValor()) {
			f.setStatus();
		}
		
	}
	public int qtdPag(){
		return p.size();
		}
	
	public void criaPag() {
		for(int i=0;i<b.size();i++) {
			Boleto bol=b.get(i);
			Pagamento pag= new Pagamento(bol.getData(),"boleto",bol.getPago());
			p.add(pag);
			
		}
		
	}
	
	
	
	
	
}

