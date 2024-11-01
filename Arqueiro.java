package proj;

public class Arqueiro extends Personagem {
	
	public Arqueiro(String nome) {
		super(nome, 880, 20);
	}
	
	@Override
	public void atacar(Personagem oponente) {
		oponente.receberDano(this.getDanoBase());
		System.out.println(getNome() + " dispartou uma flecha em " + oponente.getNome() + " à distância.");
	}
	

}
