package org.example.crudentity.repository;

import org.example.crudentity.Model.AlunoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract class AlunoRepository implements JpaRepository<AlunoEntity, Integer> {
}
