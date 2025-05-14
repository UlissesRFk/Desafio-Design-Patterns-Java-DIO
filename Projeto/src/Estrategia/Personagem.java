package Estrategia;

import Estrategia.Comportamentos.Comportamento;
import Estrategia.Poder.Poder;

public class Personagem {

    private Comportamento comportamento;
    private Poder poder;

    public void setComportamento(Comportamento comportamento){
        this.comportamento = comportamento;
    }

    public void setPoder(Poder poder){
        this.poder = poder;
    }

    public void mover(){
        comportamento.mover();
    }

    public void soltarPoder(){
        poder.soltarPoder();
    }

}
