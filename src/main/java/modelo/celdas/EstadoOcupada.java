package modelo.celdas;

import modelo.fichas.Ficha;

public class EstadoOcupada implements Estado {

    private Ficha fichaEnCelda;
    public EstadoOcupada(Ficha ficha) {
        this.fichaEnCelda = ficha;
    }

    @Override
    public Estado ponerFicha(Ficha ficha) {
        throw new CeldaOcupadaException();
    }

    public Ficha getFicha() {
        return this.fichaEnCelda;
    }

    @Override
    public int recibirContador(int contador) {
        return this.fichaEnCelda.agregarValor(contador);
    }
}
