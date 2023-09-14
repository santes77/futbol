package partes;

public class DefensorMujer implements Defensor{

    public String toString(){
        return "defensor mujer";
    }

    @Override
    public String barrida() {
        return "barrida defensor mujer";
    }

    @Override
    public String despeje() {
        return "despeje defensor mujer";
    }

    @Override
    public String cabezazoDefensivo() {
        return "cabezazo defensivo defensor mujer";
    }
    
}
