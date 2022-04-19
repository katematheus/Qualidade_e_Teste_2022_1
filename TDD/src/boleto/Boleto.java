package boleto;

import java.util.Date;

public  class Boleto {
	
	private Date data;
	private long cod;
	private double pago;
	private boolean status; 
	
	
	public  Boleto (Date data, long cod,double valor) {
		super();
		this.data=data;
		this.cod=cod;
		this.pago=valor;
		
	}
		
public Date getData() {
	
	return data;	
}

public long getCod() {
	
	return cod;	
}

}

