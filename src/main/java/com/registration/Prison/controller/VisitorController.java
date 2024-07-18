package com.registration.Prison.controller;


import com.registration.Prison.model.Visitors;
import com.registration.Prison.service.VisitorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/visitor")
@CrossOrigin
public class VisitorController {
    @Autowired
    private VisitorServiceImpl visitorService;

    @PostMapping("/visitor/adding")
    public String saveVisitor(@RequestBody Visitors visitors){
        visitorService.saveVisitor(visitors);
        return  "added";
    }

    @GetMapping("/visitor/getting")
    public List<Visitors> getVisitor(){
        return visitorService.getVisitor();
    }

    @PutMapping("/visitor/update/{id}")
    public Visitors updateVisitor(@PathVariable Long id,@RequestBody Visitors visitors){
        visitors.setId(id);
        return visitorService.updateVisitor(visitors);
    }

    @DeleteMapping("/visitor/delete")
    public void deleteVisitor(@RequestParam Long id){
        visitorService.deleteVisitor(id);
    }
}
