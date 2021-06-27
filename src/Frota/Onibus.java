package Frota;
import java.util.Random;

public class Onibus extends Veiculo{
    private static final long serialVersionUID = 1L;
    private int passageiro;

    public Onibus (String marca, String modelo, int ano, int km, int p) {
        super(marca, modelo, ano, km);
        this.passageiro = p;
        //this.passageiro = getPassageiro();
        this.segmento = "Transporte Coletivo";
    }

    public int getPassageiro() {        return passageiro;    }
    
    public String disponivel() {
        Random disp = new Random();
        if (disp.nextBoolean() == true) {return "Sim";}
        else return "Não";}
    
    public String toString() {  return "Categoria Onibus\n" + super.toString() + "Passageiros: "+ passageiro +"\n";    }
}