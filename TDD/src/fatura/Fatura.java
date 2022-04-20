package fatura;

import java.util.Date;

public  class Fatura {
	
	private Date data;
	private double valor;
	private String nome;
	private boolean status; 
	
	
	public  Fatura (String nome,double valor, Date data) {
		super();
		this.nome=nome;	
		this.valor=valor;
		this.data=data;
		this.status=false;	
	}
		
	
public String getName(){
	
	return nome;
}

public double getValor() {
	
	return valor;	
}

public Date getData() {
	
	return data;	
}

public boolean getStatus() {
	
	return status;	
}

public void setStatus () {
	
	this.status=true;
}


}

