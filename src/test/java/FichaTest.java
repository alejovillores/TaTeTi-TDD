
import modelo.fichas.Circulo;
import modelo.fichas.Cruz;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FichaTest {
    //Testear comportamiento de las fichas

    @Test
    public void test01UnaFichaCruzTieneValor1(){
        Cruz cruz = new Cruz();
        assertEquals(5,cruz.getValor());
    }

    @Test
    public void test02UnaFichaCirculoTieneValor0(){
        Circulo circulo = new Circulo();
        assertEquals(10, circulo.getValor());
    }

}
