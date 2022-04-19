package faturatest;

import java.util.Date;

public  class FaturaTest {
	
	private Date data;
	private double valor;
	private String nome;
	private boolean status; 
	
	
	public  FaturaTest (String nome,double valor, Date data,boolean status) {
		super();
		this.nome=nome;	
		this.valor=valor;
		this.data=data;
		this.status=status;
		
	}
	
	public String getName(){
		
		return nome;
	}
}

