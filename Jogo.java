package proj;
import java.util.Scanner;

public class Jogo {
	
	public static void main(String[] args) {
		Scanner Scanner = new Scanner (System.in);
		
		Personagem mago = new Mago("Mago");
		Personagem gigante = new Gigante("Gignte");
		Personagem guerreiro = new Guerreiro("Gerreiro");
		Personagem arqueiro = new Arqueiro("Arqueiro");
		
		Personagem[] personagens = { mago, gigante, guerreiro, arqueiro };
		Tabuleiro tabuleiro = new Tabuleiro(personagens, 10);
		
		tabuleiro.iniciarJogo();
		
		while (!tabuleiro.checarVencedor()) {
			for (Personagem p: personagens) {
				if (p.getVida() > 0) {
					int escolha = Scanner.nextInt();
					
					if ( escolha == 1) {
						System.out.println("Escolha um oponente para atacar:");
						for (int i = 0; i < personagens.length; i++) {
							if (personagens[i] != p && personagens[i].getVida() > 0) {
							System.out.println(i + ": " + personagens[i].getNome());
							
							}
							}
						
						int oponenteEscolhido;
						while (true){
							oponenteEscolhido = Scanner.nextInt();
							if (oponenteEscolhido >= 0 && oponenteEscolhido < personagens.length 
									&& personagens[oponenteEscolhido] != p 
									&& personagens[oponenteEscolhido].getVida() > 0) {
								break;
								
							}else {
								System.out.println("Escolha inválida, tente novamente.");
							}
							
						}
						p.atacar(personagens[oponenteEscolhido]);
					}else {
						System.out.println("Escolha uma nova posição (0 a 9):");
						int novaPosicao = Scanner.nextInt();
						tabuleiro.movimentarPersonagem(p, novaPosicao);
					}
				}
			}
		}
		Scanner.close();
	}

}
