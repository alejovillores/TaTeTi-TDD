package modelo;

import modelo.celdas.Celda;
import modelo.fichas.Circulo;
import modelo.fichas.Cruz;

import java.util.ArrayList;

public class Tablero {
    ArrayList<ArrayList<Celda>> filas;

    public Tablero() {
        this.filas = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            ArrayList<Celda> celdasEnFilai = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                celdasEnFilai.add(new Celda());
            }
            this.filas.add(celdasEnFilai);
        }
    }

    public boolean estaVacio(){
        //La suma de las celdas debe dar 0
        int contador = 0;
        for (ArrayList<Celda> fila: this.filas) {
            for (Celda celda : fila ) {
                contador += celda.recibirContador(contador);
            }
        }
        return (contador == 0);
    }

    //Solo lo usa el usuario Cruz
    public void agregarCruz(int fila,int columna){
        Celda celda = this.buscarCelda(fila,columna);
        celda.ponerFicha(new Cruz());

    }

    private Celda buscarCelda(int fila, int columna) {
        if (fila > 3 && columna > 3 ){
            throw  new PosicionInvalidadError();
        }
        return (this.filas.get(fila- 1)).get(columna - 1);
    }

    //Solo lo usa el usuario Circulo
    public void agregarCirculo(int fila,int columna){
        Celda celda = this.buscarCelda(fila,columna);

        celda.ponerFicha(new Circulo());
    }

    public boolean tatetiCruz(){
        return (this.comprobarFilas(15) || this.comprobarColumnas(15) || this.comprobarDiagonales(15));
    }

    private boolean comprobarFilas(int suma) {
        for (ArrayList<Celda> fila: this.filas){
            int contador = 0;
            for (Celda celda : fila) {
                contador = celda.recibirContador(contador);
            }
            if (contador == suma) return true;
        }
        return false;
    }

    private boolean comprobarColumnas(int suma) {
        for (int i = 0; i < 3; i++) {
            int contador = 0;
            for (int j = 0; j < 3; j++) {
                contador = (this.filas.get(j)).get(i).recibirContador(contador);
            }
            if (contador == suma) return true;
        }
        return  false;
    }

    public boolean tatetiCirculo() {
        return (this.comprobarFilas(30) || this.comprobarColumnas(30) || this.comprobarDiagonales(30));
    }

    private boolean comprobarDiagonales(int suma) {
        Celda celdaFija = (this.filas.get(1)).get(1);
        for (int i = 0; i < 3; i+=2) {
            int contador = 0;
            contador = (this.filas.get(0)).get(i).recibirContador(contador);
            contador = celdaFija.recibirContador(contador);
            contador = (this.filas.get(2)).get(2-i).recibirContador(contador);

            if (contador == suma) return  true;
        }

        return false;
    }
}
