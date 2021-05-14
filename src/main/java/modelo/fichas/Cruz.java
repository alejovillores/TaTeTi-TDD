package modelo.fichas;

public class Cruz implements Ficha{
    private int valor;

    public Cruz() {
        this.valor = 5;
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
