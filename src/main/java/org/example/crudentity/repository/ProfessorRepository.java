package org.example.crudentity.repository;

import org.example.crudentity.Model.ProfessorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract class ProfessorRepository implements JpaRepository<ProfessorEntity, Integer> {
}
