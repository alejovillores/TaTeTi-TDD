package modelo.jugador;

import modelo.Tablero;

public class JugadorCruz implements Jugador{

    private Tablero tableroDeJuego;
    private String nombre;

    public JugadorCruz(Tablero tableroDeJuego,String nombre) {
        this.tableroDeJuego = tableroDeJuego;
        this.nombre = nombre;
    }

    @Override
    public void ponerFichaEn(int fila, int columna) {
        this.tableroDeJuego.agregarCruz(fila,columna);
    }

    @Override
    public boolean comprobarVictoria() {
        return this.tableroDeJuego.tatetiCruz();
    }
}
