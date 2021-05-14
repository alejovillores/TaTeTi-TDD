package modelo.celdas;

import modelo.fichas.Ficha;

public class Celda {
    private Estado estado;

    public Celda() {
        this.estado = new EstadoVacia();
    }


    public int recibirContador(int contador) {
        return this.estado.recibirContador(contador);
    }

    public void ponerFicha(Ficha ficha) {
        this.estado = this.estado.ponerFicha(ficha);
    }
}
