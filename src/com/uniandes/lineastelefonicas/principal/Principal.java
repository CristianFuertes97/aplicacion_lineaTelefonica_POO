package com.uniandes.lineastelefonicas.principal;

import com.uniandes.lineastelefonicas.calculos.Calculadora;
import com.uniandes.lineastelefonicas.modelos.LineaTelefonica;

public class Principal {
    public static void main(String[] args) {

        // implementacion linea 1
        LineaTelefonica linea1 = new LineaTelefonica();
        linea1.setNumeroLlamadas(1);
        linea1.setNumeroDeMinutos(22);
        linea1.tipoDeLlamada(1);
        System.out.println("Linea 01");
        linea1.mostrarInformacion();
        
        System.out.println("-------------------------------");
        // implementacion linea 2
        LineaTelefonica linea2 = new LineaTelefonica();
        linea2.setNumeroLlamadas(1);
        linea2.setNumeroDeMinutos(2);
        linea2.tipoDeLlamada(2);
        System.out.println("Linea 02");
        linea2.mostrarInformacion();
        
        System.out.println("-------------------------------");
        // implementacion linea 3
        LineaTelefonica linea3 = new LineaTelefonica();
        linea3.setNumeroLlamadas(1);
        linea3.setNumeroDeMinutos(22);
        linea3.tipoDeLlamada(3);
        System.out.println("Linea 03");
        linea3.mostrarInformacion();

        // Calculadora
        Calculadora calcula = new Calculadora();
        // total de llamadas
        calcula.incluye(linea1);
        calcula.incluye(linea2);
        calcula.incluye(linea3);
        // total de minutos 
        calcula.minutos(linea1);
        calcula.minutos(linea2);
        calcula.minutos(linea3);

        // total de costo
        calcula.costo(linea1);
        calcula.costo(linea2);
        calcula.costo(linea3);

        System.out.println("-----------------------");
        System.out.println("Informacion total");

        System.out.println("Numero total de llamadas: "+ calcula.getTotalDeLlamadas());
        System.out.println("Numero total de minutos: "+ calcula.getTotalDeMinutos());
        System.out.println("Costo total: "+ calcula.getTotalCostoTotal());
        System.out.println("Costo promedio por minuto: "+ calcula.promedioTotal());

    }
}
