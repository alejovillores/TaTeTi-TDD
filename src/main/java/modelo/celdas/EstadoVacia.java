package modelo.celdas;

import modelo.fichas.Ficha;

public class EstadoVacia implements Estado {

    @Override
    public Estado ponerFicha(Ficha ficha) {
        return new EstadoOcupada(ficha);
    }

    @Override
    public int recibirContador(int contador) {
        return contador;
    }
}
