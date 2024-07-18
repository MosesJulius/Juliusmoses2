package com.registration.Prison.service;

import com.registration.Prison.model.Schedules;

import java.util.List;

public interface SchedulesServices {
    Schedules saveSched(Schedules schedules);

    List<Schedules> getSched();

    Schedules updateSched(Schedules schedules);

    void deleteSched(Long id);

}
