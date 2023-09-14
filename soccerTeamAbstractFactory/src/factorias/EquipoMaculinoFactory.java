package factorias;

import partes.Arquero;
import partes.Atacante;
import partes.Defensor;
import partes.ArqueroHombre;
import partes.DefensorHombre;
import partes.AtacanteHombre;

public class EquipoMaculinoFactory extends EquipoFactory{

    @Override
    public Arquero crearArquero() {
        return new ArqueroHombre();
    }

    @Override
    public Defensor crearDefensor() {
        return new DefensorHombre();
    }

    @Override
    public Atacante crearAtacante() {
        return new AtacanteHombre();
    }
    
}
