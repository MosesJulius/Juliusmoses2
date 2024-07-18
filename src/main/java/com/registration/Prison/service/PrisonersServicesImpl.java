package com.registration.Prison.service;

import com.registration.Prison.model.Prisoners;
import com.registration.Prison.repository.PrisonersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrisonersServicesImpl implements PrisonerService{
    @Autowired
    private PrisonersRepository prisonersRepository;

    @Override
    public Prisoners savePris(Prisoners prisoners) {
        return prisonersRepository.save(prisoners);
    }

    @Override
    public List<Prisoners> getPris() {
        return prisonersRepository.findAll();
    }

    @Override
    public Prisoners updatePris(Prisoners prisoners) {
        return prisonersRepository.save(prisoners);
    }

    @Override
    public void deletePris(Long id) {
        prisonersRepository.deleteById(id);

    }
}
