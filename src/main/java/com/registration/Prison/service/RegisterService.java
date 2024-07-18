package com.registration.Prison.service;

import com.registration.Prison.model.Registers;

import java.util.List;

public interface RegisterService {
    public Registers saveReg(Registers registers);
    public List<Registers> getReg();
    public Registers updateReg(Registers registers);
    public void deleteReg(Long id);
}
