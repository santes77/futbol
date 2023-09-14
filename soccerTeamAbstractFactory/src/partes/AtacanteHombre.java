package partes;

public class AtacanteHombre implements Atacante{

    public String toString(){
        return "Atacante hombre";
    }

    @Override
    public String patearArco() {
        return "patear al arco atacante hombre";
    }

    @Override
    public String gambetear() {
        return "gambetea atacante hombre";
    }

    @Override
    public String cabezazoOfensivo() {
        return "cabezazo ofensivo atacante hombre";
    }
    
}
