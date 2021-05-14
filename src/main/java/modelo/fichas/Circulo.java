package modelo.fichas;

public class Circulo implements Ficha {
    private int valor;

    public Circulo() {
        this.valor = 10;
    }

    @Override
    public int getValor() {
        return valor;
    }

    @Override
    public int agregarValor(int contador) {
        contador += this.valor;
        return contador;
    }
}

