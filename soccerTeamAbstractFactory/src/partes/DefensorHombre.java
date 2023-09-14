package partes;

public class DefensorHombre  implements Defensor{

    public String toString(){
        return "defensor hombre";
    }

    @Override
    public String barrida() {
        return "barrida defensor hombre";
    }

    @Override
    public String despeje() {
        return "despeje defensor hombre";
    }

    @Override
    public String cabezazoDefensivo() {
        return "cabezazo defensivo defensor hombre";
    }
    
}
