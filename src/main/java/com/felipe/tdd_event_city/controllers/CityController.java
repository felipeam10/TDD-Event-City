package com.felipe.tdd_event_city.controllers;

import com.felipe.tdd_event_city.dto.CityDTO;
import com.felipe.tdd_event_city.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/cities")
public class CityController {

    @Autowired
    private CityService service;

    @GetMapping
    public ResponseEntity<List<CityDTO>> findAll(){
        List<CityDTO> listDto = service.findAll();
        return ResponseEntity.ok().body(listDto);
    }

    @PostMapping
    public ResponseEntity<CityDTO> insert(@RequestBody CityDTO dto){
        dto = service.insert(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<CityDTO> deleteById(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

}
