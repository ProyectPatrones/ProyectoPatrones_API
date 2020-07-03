package com.ehealt.ts.repositories;

import com.ehealt.ts.models.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDoctorRepository  extends JpaRepository<Doctor, Integer> {



}
