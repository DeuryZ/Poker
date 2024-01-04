/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poker;

/**
 *
 * @author user
 */
public interface TorneoBuilder {
    TorneoBuilder numeroDeJugadores(int numeroDeJugadores);
    TorneoBuilder premioMayor(float premioMayor);
    TorneoBuilder premioSegundo(float premioSegundo);
    TorneoBuilder premioTercero(float premioTercero);
    TorneoBuilder cantidadFichas(int cantidadFichas);
    Torneo build();
}