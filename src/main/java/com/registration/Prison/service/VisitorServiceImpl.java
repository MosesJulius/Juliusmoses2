package com.registration.Prison.service;


import com.registration.Prison.model.Visitors;
import com.registration.Prison.repository.VisitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitorServiceImpl implements VisitorService {
    @Autowired
    private VisitorRepository visitorRepository;

    @Override
    public Visitors saveVisitor(Visitors visitors) {
        return visitorRepository.save(visitors);
    }

    @Override
    public List<Visitors> getVisitor() {
        return visitorRepository.findAll();
    }

    @Override
    public Visitors updateVisitor(Visitors visitors) {
        return visitorRepository.save(visitors);
    }

    @Override
    public void deleteVisitor(Long id) {
        visitorRepository.deleteById(id);
    }
}
