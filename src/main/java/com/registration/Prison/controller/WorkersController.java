package com.registration.Prison.controller;


import com.registration.Prison.model.Workers;
import com.registration.Prison.service.WorkersServiceIpml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/worker")
@CrossOrigin
public class WorkersController {
    @Autowired
    private WorkersServiceIpml workersServiceIpml;


    @PostMapping("/worker/adding")
    public String saveWorker(@RequestBody Workers workers){
        workersServiceIpml.saveWorker(workers);
        return "was added";
    }
    @GetMapping("/worker/getting")
    public List<Workers> getWorkers(){
      return   workersServiceIpml.getWorkers();
    }

    @PutMapping("/worker/update/{id}")
    public Workers updateWorker(@PathVariable Long id,@RequestBody Workers workers){
        workers.setId(id);
        return workersServiceIpml.updateWorker(workers);
    }

    @DeleteMapping("worker/delete")
    public void deleteWorker(@RequestParam Long id){
        workersServiceIpml.deleteWorker(id);
    }
}
