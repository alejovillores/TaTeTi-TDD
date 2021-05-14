package modelo.celdas;

import modelo.fichas.Ficha;

public interface Estado {

    Estado ponerFicha(Ficha ficha);

    int recibirContador(int contador);
}
