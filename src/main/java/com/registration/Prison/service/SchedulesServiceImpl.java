package com.registration.Prison.service;

import com.registration.Prison.model.Schedules;
import com.registration.Prison.repository.SchedulesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SchedulesServiceImpl implements SchedulesServices{
    @Autowired
    private SchedulesRepository schedulesRepository;

    @Override
    public Schedules saveSched(Schedules schedules) {
        return schedulesRepository.save(schedules);
    }

    @Override
    public List<Schedules> getSched() {
        return schedulesRepository.findAll();
    }

    @Override
    public Schedules updateSched(Schedules schedules) {
        return schedulesRepository.save(schedules);
    }

    @Override
    public void deleteSched(Long id) {
        schedulesRepository.deleteById(id);
    }


}
