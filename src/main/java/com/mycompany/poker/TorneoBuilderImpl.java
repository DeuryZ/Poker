/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poker;

/**
 *
 * @author user
 */
public class TorneoBuilderImpl implements TorneoBuilder{
    private Torneo torneo = new Torneo();
    
    @Override
    public TorneoBuilder numeroDeJugadores(int numeroDeJugadores){
        torneo.setNumeroDeJugadores(numeroDeJugadores);
        return this;
    }

    @Override
    public TorneoBuilder premioMayor(float premioMayor) {
        torneo.setPremioMayot(premioMayor);
        return this;
    }

    @Override
    public TorneoBuilder premioSegundo(float premioSegundo) {
        torneo.setPremioSegundo(premioSegundo);
        return this;
    }

    @Override
    public TorneoBuilder premioTercero(float premioTercero) {
        torneo.setPremioTercero(premioTercero);
        return this;
    }

    @Override
    public TorneoBuilder cantidadFichas(int cantidadFichas) {
        torneo.setCantidadFichas(cantidadFichas);
        return this;
    }

    @Override
    public Torneo build() {
        return torneo;
    }
}