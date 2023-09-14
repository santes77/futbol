import factorias.EquipoFactory;
import factorias.EquipoFemeninoFactory;
import factorias.EquipoMaculinoFactory;
import partes.Atacante;
import partes.Defensor;
import partes.Arquero;

public class App {
    public static void main(String[] args) throws Exception {
        crearEquipo(new EquipoMaculinoFactory());
        crearEquipo(new EquipoFemeninoFactory());
    }

    public static void crearEquipo(EquipoFactory factory){
        Arquero arquero = factory.crearArquero();
        Defensor defensor = factory.crearDefensor();
        Atacante atacante = factory.crearAtacante();

        System.out.println("______Un equipo fue creado:_____");
        System.out.println(arquero.saqueArco());
        System.out.println(defensor.barrida());
        System.out.println(atacante.cabezazoOfensivo());
    }
}
