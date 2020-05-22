package com.hw.hibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
 
import com.hw.hibernate.model.Country;
import com.hw.hibernate.service.CountryService;
 
@RestController
public class CountryController {
 
    @Autowired
    private CountryService cservice;
 
    // Get all countries
    @RequestMapping(value="/countries", method=RequestMethod.GET, headers="Accept=application/json")
    public List<Country> getCountries() {
        List<Country> list = cservice.getAllCountries();      
        return list;
    }
 
    // Get a country by id
    @RequestMapping(value="/country/{id}", method=RequestMethod.GET, headers="Accept=application/json")
    public Country getCountryById(@PathVariable(name="id") int id) {
        return cservice.getCountry(id);
    }   
    
    // POST a country to db
    // TODO
//    @RequestMapping(value="/country", method=RequestMethod.POST, produces = "application/json", consumes = "application/json")
//    @ResponseBody
//    public String addCountry(@RequestBody Country country) throws Exception {
//        String name = country.getCname();
//        return name;
//    }
}
