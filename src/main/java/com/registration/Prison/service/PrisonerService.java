package com.registration.Prison.service;

import com.registration.Prison.model.Prisoners;

import java.util.List;

public interface PrisonerService {
    public Prisoners savePris(Prisoners prisoners);
    public List<Prisoners> getPris();
    public Prisoners updatePris(Prisoners prisoners);
    public void deletePris(Long id);
}
