package Frota;

import java.util.Random;

import Frota.Veiculo;

public class Carro extends Veiculo {

	private static final long serialVersionUID = 1L;

	public Carro(String marca, String modelo, int ano, int km) {
		super(marca, modelo, ano, km);
		this.segmento = "Passeio";
		
	}
	@Override
	public String disponivel() {
		Random disp = new Random();
		if (disp.nextBoolean() == true) {return "Sim";}
		else return "Não";}
	
}
