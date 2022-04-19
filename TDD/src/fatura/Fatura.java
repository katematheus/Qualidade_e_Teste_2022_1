package fatura;

import java.util.Date;

public  class Fatura {
	
	private Date data;
	private double valor;
	private String nome;
	private boolean status; 
	
	
	public  Fatura (String nome,double valor, Date data,boolean status) {
		super();
		this.nome=nome;	
		this.valor=valor;
		this.data=data;
		this.status=status;	
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


}

