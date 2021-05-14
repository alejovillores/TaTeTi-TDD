import modelo.Tablero;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TableroTest {
    @Test
    public void test01ElTablerAlInstanciarseComienzaConTodasLasCeldasVacias(){
        Tablero tablero = new Tablero();
        assertTrue(tablero.estaVacio());
    }

    @Test
    public void test02ElTableroRecibe1FichaCruz(){
        Tablero tablero = new Tablero();
        tablero.agregarCruz(1,2);
        assertFalse(tablero.estaVacio());
    }

    @Test
    public void test03ElTableroRecibe1FichaCirculo(){
        Tablero tablero = new Tablero();
        tablero.agregarCirculo(1,2);
        assertFalse(tablero.estaVacio());
    }

    @Test
    public void test04ElTableroRecibe3CrucesEnFilaYHaceTaTeTi(){
        Tablero tablero = new Tablero();
        tablero.agregarCruz(1,1);
        tablero.agregarCruz(1,2);
        tablero.agregarCruz(1,3);

        assertTrue(tablero.tatetiCruz());
    }
    @Test
    public void test05ElTableroRecibe3CrucesEnFila2YHaceTaTeTi(){
        Tablero tablero = new Tablero();
        tablero.agregarCruz(2,1);
        tablero.agregarCruz(2,2);
        tablero.agregarCruz(2,3);

        assertTrue(tablero.tatetiCruz());
    }
    @Test
    public void test06ElTableroRecibe3CrucesEnFila3YHaceTaTeTi(){
        Tablero tablero = new Tablero();
        tablero.agregarCruz(3,1);
        tablero.agregarCruz(3,2);
        tablero.agregarCruz(3,3);

        assertTrue(tablero.tatetiCruz());
    }

    @Test
    public void test07ElTableroRecibe3CrucesEnColumna1YHaceTaTeTi(){
        Tablero tablero = new Tablero();
        tablero.agregarCruz(1,1);
        tablero.agregarCruz(2,1);
        tablero.agregarCruz(3,1);

        assertTrue(tablero.tatetiCruz());
    }

    @Test
    public void test08ElTableroRecibe3CrucesEnColumna2YHaceTaTeTi(){
        Tablero tablero = new Tablero();
        tablero.agregarCruz(1,2);
        tablero.agregarCruz(2,2);
        tablero.agregarCruz(3,2);

        assertTrue(tablero.tatetiCruz());
    }

    @Test

    public void test09ElTableroRecibe3CrucesEnColumna3YHaceTaTeTi(){
        Tablero tablero = new Tablero();
        tablero.agregarCruz(1,3);
        tablero.agregarCruz(2,3);
        tablero.agregarCruz(3,3);

        assertTrue(tablero.tatetiCruz());
    }
    @Test
    public void test10ElTableroRecibe3CirculosEnFilaYHaceTaTeTi(){
        Tablero tablero = new Tablero();
        tablero.agregarCirculo(1,1);
        tablero.agregarCirculo(1,2);
        tablero.agregarCirculo(1,3);

        assertTrue(tablero.tatetiCirculo());
    }
    @Test
    public void test11ElTableroRecibe3CirculosEnFila2YHaceTaTeTi(){
        Tablero tablero = new Tablero();
        tablero.agregarCirculo(2,1);
        tablero.agregarCirculo(2,2);
        tablero.agregarCirculo(2,3);

        assertTrue(tablero.tatetiCirculo());
    }
    @Test
    public void test12ElTableroRecibe3CirculosEnFila3YHaceTaTeTi(){
        Tablero tablero = new Tablero();
        tablero.agregarCirculo(3,1);
        tablero.agregarCirculo(3,2);
        tablero.agregarCirculo(3,3);

        assertTrue(tablero.tatetiCirculo());
    }

    @Test
    public void test13ElTableroRecibe3CirculosEnColumna1YHaceTaTeTi(){
        Tablero tablero = new Tablero();
        tablero.agregarCirculo(1,1);
        tablero.agregarCirculo(2,1);
        tablero.agregarCirculo(3,1);

        assertTrue(tablero.tatetiCirculo());
    }

    @Test
    public void test14ElTableroRecibe3CirculosEnColumna2YHaceTaTeTi(){
        Tablero tablero = new Tablero();
        tablero.agregarCirculo(1,2);
        tablero.agregarCirculo(2,2);
        tablero.agregarCirculo(3,2);

        assertTrue(tablero.tatetiCirculo());
    }

    @Test
    public void test15ElTableroRecibe3CirculosEnColumna3YHaceTaTeTi(){
        Tablero tablero = new Tablero();
        tablero.agregarCirculo(1,3);
        tablero.agregarCirculo(2,3);
        tablero.agregarCirculo(3,3);

        assertTrue(tablero.tatetiCirculo());
    }

    @Test
    public void test16ElTableroConCrucesEnDiagonalIzquierdaHaceTaTeTi(){
        Tablero tablero = new Tablero();
        tablero.agregarCruz(1,1);
        tablero.agregarCruz(2,2);
        tablero.agregarCruz(3,3);

        assertTrue(tablero.tatetiCruz());
    }

    @Test
    public void test17ElTableroConCrucesEnDiagonalDerechaHaceTaTeTi(){
        Tablero tablero = new Tablero();
        tablero.agregarCruz(1,3);
        tablero.agregarCruz(2,2);
        tablero.agregarCruz(3,1);

        assertTrue(tablero.tatetiCruz());
    }

    @Test
    public void test18ElTableroConCrucesEnDiagonalIzquierdaHaceTaTeTi(){
        Tablero tablero = new Tablero();
        tablero.agregarCirculo(1,1);
        tablero.agregarCirculo(2,2);
        tablero.agregarCirculo(3,3);

        assertTrue(tablero.tatetiCirculo());
    }

    @Test
    public void test19ElTableroConCrucesEnDiagonalDerechaHaceTaTeTi(){
        Tablero tablero = new Tablero();
        tablero.agregarCirculo(1,3);
        tablero.agregarCirculo(2,2);
        tablero.agregarCirculo(3,1);

        assertTrue(tablero.tatetiCirculo());
    }

    @Test
    public void testJuegoMixtoGanaCruz(){
        Tablero tablero = new Tablero();
        tablero.agregarCruz(1,3);
        tablero.agregarCirculo(2,2);
        tablero.agregarCruz(2,3);
        tablero.agregarCirculo(1,1);
        tablero.agregarCruz(3,3);

        assertTrue(tablero.tatetiCruz());
    }

}
