import Estrategia.Personagem;
import Estrategia.Comportamentos.Comportamento;
import Estrategia.Comportamentos.ComportamentoAgressivo;
import Estrategia.Comportamentos.ComportamentoNormal;
import Estrategia.Poder.Poder;
import Estrategia.Poder.PoderFogo;
import Estrategia.Poder.PoderGelo;
import Singleton.SingletonLazy;
import Facade.Facade;

public class Test {
    public static void main(String[] args) {

        //Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println("\n" + lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy+ "\n");

        //Stategy
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();
        Poder fogo = new PoderFogo();
        Poder gelo = new PoderGelo();

        Personagem personagem = new Personagem();
        personagem.setComportamento(agressivo);
        personagem.mover();
        personagem.mover();
        personagem.mover();
        personagem.setComportamento(normal);
        personagem.mover();
        personagem.mover();
        personagem.mover();
        personagem.setPoder(fogo);
        personagem.soltarPoder();
        personagem.soltarPoder();
        personagem.setPoder(gelo);
        personagem.soltarPoder();
        personagem.soltarPoder();
        personagem.soltarPoder();
        personagem.soltarPoder();
        

        //Facade
        Facade facade = new Facade();
        facade.migrarCliente("Ulisses", "89021123448");


    }
}
