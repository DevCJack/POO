package Frota;

import java.io.Serializable;

public abstract class Veiculo implements Serializable {

	private static final long serialVersionUID = 1L;
	private   String marca, modelo;
	private   int ano, km;	
	protected String segmento;
	protected boolean disponivel;
	
	public Veiculo(String marca, String modelo, int ano, int km) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.km = km;
	}
	public String toString() {
		String retorno = "";
		retorno += "Marca: "     + this.marca     + "\n";
		retorno += "Modelo: "    + this.modelo    + "\n";
		retorno += "Ano: "       + this.ano     + "\n";
		retorno += "Km: " + this.km + " km.\n";
		retorno += "Segmento: "  + this.segmento  + "\n";
		retorno += "Disponibilade: "  + disponivel()        + "\n";
					
		return retorno;
	}
	public abstract String disponivel();
}