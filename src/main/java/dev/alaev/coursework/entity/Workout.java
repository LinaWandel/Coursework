package dev.alaev.coursework.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "workout")
@Entity
@Data
public class Workout {
    @Id
    @Column(name = "name", nullable = false, length = 20)
    private String name;

    @Column(name = "type", nullable = false, length = 15)
    private String type;

    @Column(name = "musc_group", length = 50)
    private String muscGroup;

    @Column(name = "kkal")
    private Integer kkal;

    @Column(name = "level", length = 15)
    private String level;
}