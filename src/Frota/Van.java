package Frota;

import Frota.Veiculo;

public class Van extends Veiculo {
	
	private static final long serialVersionUID = 1L;
	private int passageiro;

	public Van(String marca, String modelo, int ano, int km, int p) {
		super(marca, modelo, ano, km);
		this.segmento = "Transporte";
		this.passageiro = p;		
	}
	
	@Override
	public boolean disponivel() {return disponivel;}
	
	public int getPassageiro() {return passageiro;}
	
	public String toString() {
		String retorno = "";
		retorno += "Passageiros: " + passageiro;
		return retorno;
	}
	

}
