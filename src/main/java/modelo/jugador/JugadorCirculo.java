package modelo.jugador;

import modelo.Tablero;

public class JugadorCirculo implements Jugador{
    private Tablero tablero;
    private String nombre;

    public JugadorCirculo(Tablero tablero,String nombre) {
        this.tablero = tablero;
        this.nombre = nombre;
    }

    @Override
    public void ponerFichaEn(int fila, int columna) {

    }

    @Override
    public boolean comprobarVictoria() {
        return this.tablero.tatetiCirculo();
    }
}
