package se.lexicon.g4_jpa_assignment.entity;

import lombok.AllArgsConstructor;
import lombok.Data;


import javax.persistence.*;


@AllArgsConstructor
@Data

@Entity
public class RecipeInstruction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String instructions;

    public RecipeInstruction() {
    }

    public RecipeInstruction(String instructions) {
        this.instructions = instructions;
    }
}
