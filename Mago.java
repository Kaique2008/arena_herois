package proj;

public class Mago extends Personagem {
	private int ki;
	
	public Mago(String nome) {
		super(nome, 100, 25);
		this.ki = 50;
		
	}
	
	@Override
	public void atacar(Personagem oponente) {
		if(ki >= 10) {
			oponente.receberDano(this.getDanoBase() + 15);
			ki -= 10;
			System.out.println(getNome() + " lançou um freitiço em " + oponente.getNome() + " à distância.");
		} else {
			System.out.println(getNome() + " não tem ki sufuciente para atacar");
		}
	}
	

}
