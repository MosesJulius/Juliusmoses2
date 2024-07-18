package com.registration.Prison.service;

import com.registration.Prison.model.Workers;

import java.util.List;

public interface WorkerService {
    public Workers saveWorker(Workers workers);
    public List<Workers> getWorkers();
    public Workers updateWorker(Workers workers);
    public   void deleteWorker(Long id);
}
