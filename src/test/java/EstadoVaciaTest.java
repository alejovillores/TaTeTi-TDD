import modelo.celdas.EstadoOcupada;
import modelo.celdas.EstadoVacia;
import modelo.fichas.Cruz;
import modelo.fichas.Ficha;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EstadoVaciaTest {
    @Test
    public void test01CeldaVaciaPuedeAgregarFichaYDevuelveUnaCeldaOcupada(){
        EstadoVacia celdaVacia = new EstadoVacia();
        Ficha cruz = new Cruz();

        assertEquals( EstadoOcupada.class,(celdaVacia.ponerFicha(cruz)).getClass());
    }

}
