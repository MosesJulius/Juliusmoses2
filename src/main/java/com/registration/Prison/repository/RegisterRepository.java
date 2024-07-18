package com.registration.Prison.repository;

import com.registration.Prison.model.Registers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RegisterRepository extends JpaRepository<Registers,Long> {
}
