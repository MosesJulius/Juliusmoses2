package com.registration.Prison.controller;

import com.registration.Prison.model.Schedules;
import com.registration.Prison.service.SchedulesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/schedule")
@CrossOrigin
public class SchedulesController {

    @Autowired
    private SchedulesServices schedulesServices;

    @PostMapping("/schedule/adding")
    public String saveSched(@RequestBody Schedules schedules){
        schedulesServices.saveSched(schedules);
        return  "added";
    }

    @GetMapping("/schedule/getting")
    public List<Schedules> getSched(){
        return schedulesServices.getSched();
    }

    @PutMapping("/schedule/update/{id}")
    public Schedules updateSched(@PathVariable Long id,@RequestBody Schedules schedules){
        schedules.setId(id);
        return schedulesServices.updateSched(schedules);
    }
    @DeleteMapping("/schedule/delete")
    public void deleteSched(@RequestParam Long id) {
        schedulesServices.deleteSched(id);
    }
}
