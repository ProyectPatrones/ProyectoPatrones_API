package com.ehealt.ts.repositories;

import com.ehealt.ts.models.Opinion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOpinionRepository extends JpaRepository<Opinion, Integer> {
}
