package br.edu.iftm.teste;

import br.edu.iftm.rpg.Jogador;
import br.edu.iftm.rpg.Inimigo;
import br.edu.iftm.rpg.Luta;

public class RpgTeste 
{
    public static void main(String[] args)
    {
        Jogador rogue = new Jogador("Thor", 100, 75);
        Inimigo mage = new Inimigo("Thanus", 100, 45);
        Luta luta = new Luta();
        
        rogue.status();
        mage.status();
        luta.lutar(rogue, mage);
        
    }
}