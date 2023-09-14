package partes;

public class AtacanteMujer implements Atacante{

    public String toString(){
        return "Atacante mujer";
    }

    @Override
    public String patearArco() {
        return "patear al arco atacante mujer";
    }

    @Override
    public String gambetear() {
        return "gambetea atacante mujer";
    }

    @Override
    public String cabezazoOfensivo() {
        return "cabezazo ofensivo atacante mujer";
    }
    
}
