package com.registration.Prison.controller;


import com.registration.Prison.model.Prisoners;
import com.registration.Prison.service.PrisonersServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/prisoner")
@CrossOrigin
public class PrisonersController {
    @Autowired
    private PrisonersServicesImpl prisonersServices;

    @PostMapping("/prisoner/adding")
    public String savePris(@RequestBody Prisoners prisoners){
        prisonersServices.savePris(prisoners);
        return "added";
    }

    @GetMapping("/prisoner/getting")
    public List<Prisoners> getPris(){
        return prisonersServices.getPris();
    }

    @PutMapping("/prisoner/update/{id}")
    public Prisoners updatepris(@PathVariable Long id,@RequestBody Prisoners prisoners){
        prisoners.setId(id);
        return prisonersServices.updatePris(prisoners);
    }

    @DeleteMapping("/prisoner/delete")
    public void deletePris(@RequestParam Long id){
        prisonersServices.deletePris(id);
    }
}
