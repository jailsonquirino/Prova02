package br.edu.iftm.rpg;

import java.util.Random;

public class Luta {
    private Jogador jogador;
    private Inimigo inimigo;
    
    public void lutar(Jogador jogador, Inimigo inimigo)
    {
        this.jogador = jogador;
        this.inimigo =  inimigo;

        while((jogador.getVida() > 0) & (inimigo.getVida() > 0)){
            rand(); 
        }

    } 
    
    public void rand(){
        Random rand = new Random();
        int n = rand.nextInt(2);

        if(n == 0){
            System.out.println("\nVez do " + jogador.getNome());
            jogador.atacar(inimigo);
        }
        else if(n == 1){
            System.out.println("\nVez do " + inimigo.getNome());
            inimigo.atacar(jogador);
        }
    }
}