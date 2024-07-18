package com.registration.Prison.controller;


import com.registration.Prison.model.Registers;
import com.registration.Prison.service.RegiaterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/register")
@CrossOrigin
public class RegisterController {

    @Autowired
    private RegiaterServiceImpl regiaterService;

    @PostMapping("/register/adding")
    public String saveReg(@RequestBody Registers registers){
        regiaterService.saveReg(registers);
        return  "added";
    }

    @GetMapping("/register/getting")
    public List<Registers> getReg(){
        return regiaterService.getReg();
    }

    @PutMapping("/register/update/{id}")
    public Registers updateReg(@PathVariable Long id,@RequestBody Registers registers){
        registers.setId(id);
        return regiaterService.updateReg(registers);
    }
    @DeleteMapping("/register/delete")
    public void deleteReg(@RequestParam Long id){
        regiaterService.deleteReg(id);
    }
}
