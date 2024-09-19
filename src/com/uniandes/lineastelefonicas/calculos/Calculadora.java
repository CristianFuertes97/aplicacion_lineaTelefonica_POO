package com.uniandes.lineastelefonicas.calculos;

import com.uniandes.lineastelefonicas.modelos.LineaTelefonica;

public class Calculadora{
    private int totalDeLlamadas;
    private int totalDeMinutos;
    private int totalCostoTotal;
    private double promedio;

    public double getPromedio() {
        return this.promedio;
    }

	public int getTotalCostoTotal() {
		return this.totalCostoTotal;
	}

    public int getTotalDeMinutos() {
        return this.totalDeMinutos;
    }

	public int getTotalDeLlamadas() {
		return this.totalDeLlamadas;
	}

    
    public void incluye(LineaTelefonica linea){
        this.totalDeLlamadas += linea.getNumeroLlamadas();
    }
    
    public void minutos(LineaTelefonica linea){
        this.totalDeMinutos += linea.getNumeroDeMinutos();
    }

    public void costo(LineaTelefonica linea){
        this.totalCostoTotal += linea.getCostoTotal();
    }

    public double promedioTotal(){
        double valor = this.totalCostoTotal / this.totalDeMinutos;
        return valor;
    }

}
