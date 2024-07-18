package com.registration.Prison.repository;

import com.registration.Prison.model.Visitors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitorRepository extends JpaRepository<Visitors,Long> {
}
