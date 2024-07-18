package com.registration.Prison.service;


import com.registration.Prison.model.Registers;
import com.registration.Prison.repository.RegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegiaterServiceImpl  implements RegisterService{

    @Autowired
    private RegisterRepository registerRepository;
    @Override
    public Registers saveReg(Registers registers) {
        return registerRepository.save(registers);
    }

    @Override
    public List<Registers> getReg() {
        return registerRepository.findAll();
    }

    @Override
    public Registers updateReg(Registers registers) {
        return registerRepository.save(registers);
    }

    @Override
    public void deleteReg(Long id) {
        registerRepository.deleteById(id);
    }
}
