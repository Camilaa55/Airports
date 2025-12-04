/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.eti.cdsp.airports.DTO;

import br.eti.cdsp.airports.entities.Airport;

/**
 *
 * @author DIT2A
 */
public class AirportMinDTO {
    
    private long id;
    private String name;
    private String city;
    private String iataCode;
    
    public AirportMinDTO() {
    }
    
    public AirportMinDTO(Airport airport) {
        this.id = airport.getId();
        this.name = airport.getName();
        this.city = airport.getCity();
        this.iataCode = airport.getIataCode();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getIataCode() {
        return iataCode;
    }

    public void setIataCode(String iataCode) {
        this.iataCode = iataCode;
    }
    
    
    
}
