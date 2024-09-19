package com.uniandes.lineastelefonicas.modelos;

public class Empresa {
    // Atributos
   
    private int numeroLlamadas;
    private int numeroDeMinutos;
    private int costoTotal;

    // Getters and Setters
    public int getNumeroLlamadas() {
        return this.numeroLlamadas;
    }

    public void setNumeroLlamadas(int numeroLlamadas) {
        this.numeroLlamadas = numeroLlamadas;
    }

    public int getNumeroDeMinutos() {
        return this.numeroDeMinutos;
    }

    public void setNumeroDeMinutos(int numeroDeMinutos) {
        this.numeroDeMinutos = numeroDeMinutos;
    }

    public int getCostoTotal() {
		return this.costoTotal;
	}

	public void setCostoTotal(int costoTotal) {
		this.costoTotal = costoTotal;
	}

    // Metodos
    public void reiniciar(){
        this.numeroDeMinutos = 0;
        this.numeroLlamadas = 0;
        setCostoTotal(0);
    }

    public int duracionLlamadas(){
        int total = numeroDeMinutos * numeroLlamadas;
        return total;
    }

    public void mostrarInformacion(){
        System.out.println("Numero de llamadas realizas: "+ numeroLlamadas);
        System.out.println("Duracion total de llamadas: "+ duracionLlamadas());
        System.out.println("Costo total de llamada: " + getCostoTotal());
    }
}