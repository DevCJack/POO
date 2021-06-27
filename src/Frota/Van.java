package Frota;

import java.util.Random;

public class Van extends Veiculo {
	
	private static final long serialVersionUID = 1L;
	private int passageiro;
	
	public Van(String marca, String modelo, int ano, int km, int p) {
		super(marca, modelo, ano, km);
		this.segmento = "Transporte";
		this.passageiro = p;		
	}
	
	@Override
	public String disponivel() {
		Random disp = new Random();
		if (disp.nextBoolean() == true) {return "Sim";}
		else return "Não";}
	
	public int getPassageiro() {return passageiro;}
	

	public String toString() {
		return "Categoria Van\n"+super.toString() + "Passageiros: "+ getPassageiro() +"\n";
	}
}
