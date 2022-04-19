package pagamento;

import java.util.Date;

public  class Pagamento {
	
	private Date data;
	private String tipo;
	private double pago;
	
	
	
	public  Pagamento (Date data, String tipo,double valor) {
		super();
		this.data=data;
		this.tipo=tipo;
		this.pago=valor;
		
	}
	
	
	public Date getData(){
		
		return data;
	
	}
	public String getTipo(){
		
		return tipo;
	
	}
	public double getValor(){
		
		return pago;
	
	}
	

}

