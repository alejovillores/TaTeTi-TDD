import modelo.celdas.CeldaOcupadaException;
import modelo.celdas.EstadoOcupada;
import modelo.fichas.Circulo;
import modelo.fichas.Cruz;
import modelo.fichas.Ficha;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EstadoOcupadaTest {
    @Test
    public void test01CeldaOcupadaPoseeUnaCruzAlInstanciarse(){
        Ficha ficha = new Cruz();
        EstadoOcupada celdaOcupada = new EstadoOcupada(ficha);
        assertEquals(5,(celdaOcupada.getFicha()).getValor());
    }

    @Test
    public void test02CeldaOcupadaPoseeUnCirculoAlInstanciarse(){
        Ficha ficha = new Circulo();
        EstadoOcupada celdaOcupada = new EstadoOcupada(ficha);
        assertEquals(10,(celdaOcupada.getFicha()).getValor());
    }

    @Test
    public void testUnEstadoOcupadoNoDebePonerNuevaFicha(){
        Ficha ficha = new Circulo();
        Ficha ficha2 = new Circulo();
        EstadoOcupada celdaOcupada = new EstadoOcupada(ficha);

        assertThrows(CeldaOcupadaException.class,
                () -> celdaOcupada.ponerFicha(ficha2));
    }
}
