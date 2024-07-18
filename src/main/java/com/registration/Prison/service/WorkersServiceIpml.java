package com.registration.Prison.service;


import com.registration.Prison.model.Workers;
import com.registration.Prison.repository.WorkersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkersServiceIpml implements WorkerService{
    @Autowired
    private WorkersRepository workersRepository;

    @Override
    public Workers saveWorker(Workers workers) {
        return workersRepository.save(workers);
    }

    @Override
    public List<Workers> getWorkers() {
        return workersRepository.findAll();
    }

    @Override
    public Workers updateWorker(Workers workers) {
        return workersRepository.save(workers);
    }

    @Override
    public void deleteWorker(Long id) {
        workersRepository.deleteById(id);
    }
}
