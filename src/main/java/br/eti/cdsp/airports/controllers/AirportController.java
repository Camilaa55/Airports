/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.eti.cdsp.airports.controllers;

import br.eti.cdsp.airports.DTO.AirportMinDTO;
import br.eti.cdsp.airports.entities.Airport;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import br.eti.cdsp.airports.service.AirportService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

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
    
    @GetMapping("/city/{cityName}")
    public ResponseEntity<List<Airport>> findByCityIgnoreCase(@PathVariable String cityName) {
        List<Airport> result = airportService.findByCity(cityName);
        
        if (result.isEmpty()){
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(result);
        }
    }
    @GetMapping("/country/{countryName}")
    public ResponseEntity<List<AirportMinDTO>> findByCountryIgnoreCase(@PathVariable String countryName) {
        List<AirportMinDTO> result = airportService.findByCountry(countryName);
        
        if (result.isEmpty()){
            
            return ResponseEntity.notFound().build();
            
        } else {
            
            return ResponseEntity.ok(result);
        }
    }
     @GetMapping("/iatacode/{iataCode}")
     public ResponseEntity<Airport> findByIataCode(@PathVariable String iataCode){
         Airport result = airportService.findByIataCode(iataCode);
         if (result == null){
             return ResponseEntity.notFound().build();
         }else{
             return ResponseEntity.ok(result);
         }
     }
}
     

