package org.example.crudentity.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class ProfessorEntity {
    @Id
    private int id;
    private String nome;
    private String cpf;
    private Integer matricula;
    public String genero;
    private LocalDate dataNascimento;
    private float salario;
    private String disciplinaAssociada;
}
