package com.registration.Prison.service;

import com.registration.Prison.model.Visitors;

import java.util.List;

public interface VisitorService {
    public Visitors saveVisitor(Visitors visitors);
    public List<Visitors> getVisitor ();
    public Visitors updateVisitor(Visitors visitors);
    public void deleteVisitor(Long id);
}
