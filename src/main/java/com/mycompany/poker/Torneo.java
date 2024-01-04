/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poker;

/**
 *
 * @author user
 */
public class Torneo {

    private int numeroDeJugadores;
    private float premioMayot;
    private float premioSegundo;
    private float premioTercero;
    private int cantidadFichas;

    public Torneo() {
    }

    public int getNumeroDeJugadores() {
        return numeroDeJugadores;
    }

    public void setNumeroDeJugadores(int numeroDeJugadores) {
        this.numeroDeJugadores = numeroDeJugadores;
    }

    public float getPremioMayot() {
        return premioMayot;
    }

    public void setPremioMayot(float premioMayot) {
        this.premioMayot = premioMayot;
    }

    public float getPremioSegundo() {
        return premioSegundo;
    }

    public void setPremioSegundo(float premioSegundo) {
        this.premioSegundo = premioSegundo;
    }

    public float getPremioTercero() {
        return premioTercero;
    }

    public void setPremioTercero(float premioTercero) {
        this.premioTercero = premioTercero;
    }

    public int getCantidadFichas() {
        return cantidadFichas;
    }

    public void setCantidadFichas(int cantidadFichas) {
        this.cantidadFichas = cantidadFichas;
    }
    
}