package partes;

public class ArqueroMujer implements Arquero{

    public String toString(){
        return "Arquero mujer";
    }

    @Override
    public String tirarseIzquierda() {
        return "tirarse a la izquierda arquero mujer";
    }

    @Override
    public String saqueArco() {
        return "saque de arco arquero mujer";
    }

    @Override
    public String tirarseDerecha() {
        return "tirarse a la derecha arquero mujer";
    }
    
}
