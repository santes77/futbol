package partes;

public class ArqueroHombre implements Arquero{

    public String toString(){
        return "Arquero hombre";
    }

    @Override
    public String tirarseIzquierda() {
        return "tirarse a la izquierda arquero hombre";
    }

    @Override
    public String saqueArco() {
        return "saque de arco arquero hombre";
    }

    @Override
    public String tirarseDerecha() {
        return "tirarse a la derecha arquero hombre";
    }
}
