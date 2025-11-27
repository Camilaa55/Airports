/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.eti.cdsp.airports.controllers;

import br.eti.cdsp.airports.entities.Airport;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import br.eti.cdsp.airports.service.AirportService;

/**
 *
 * @author DIT2A
 */
@RestController
public class AirportController {
 
    @Autowired
    private AirportService airportService;
    
    /**
     * *Endpoint /airports/airport
     * Retorna TODOS os aeroportos da base de dados.
     * @return 
     */
    
    @GetMapping("/airport")
    public List<Airport> findAll() {
        List<Airport> result = airportService.findAll();
        return result;
    }
}
