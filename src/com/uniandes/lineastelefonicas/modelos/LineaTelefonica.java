package com.uniandes.lineastelefonicas.modelos;

public class LineaTelefonica extends Empresa {
    // Atributos
    private int costoTotal;

    public int getCostoTotal() {
        return this.costoTotal;
    }

    public void setCostoTotal(int costoTotal) {
        this.costoTotal = costoTotal;
    }

    // metodos
    public void tipoDeLlamada(int valor){
        switch (valor) {
            case 1:
                costoTotal = duracionLlamadas()* 35; 
                break;
            case 2:
                costoTotal = duracionLlamadas() * 380;
                break;
            case 3:
                costoTotal = duracionLlamadas() * 999;
                break;
            default:
                break;
        }

    }



}
