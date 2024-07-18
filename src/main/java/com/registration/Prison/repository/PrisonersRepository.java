package com.registration.Prison.repository;


import com.registration.Prison.model.Prisoners;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrisonersRepository extends JpaRepository<Prisoners,Long> {
}
