package com.registration.Prison.repository;

import com.registration.Prison.model.Workers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkersRepository extends JpaRepository<Workers,Long> {
}
