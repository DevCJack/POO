package Frota;

import java.util.Random;

import Frota.Veiculo;

public class Carro extends Veiculo {

	private static final long serialVersionUID = 1L;
	private final int portamalas;

	public Carro(String marca, String modelo, int ano, int km, int pm) {
		super(marca, modelo, ano, km);
		this.segmento = "Passeio";
		this.portamalas = pm;
		
	}
	@Override
	public String disponivel() {
		Random disp = new Random();
		if (disp.nextBoolean() == true) {return "Sim";}
		else return "Não";}
	
	public String toString() { return super.toString() + "Porta-malas: "+ this.portamalas + " litros.\n";}
	
}
