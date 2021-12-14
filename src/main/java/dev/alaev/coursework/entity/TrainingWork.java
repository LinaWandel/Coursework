package dev.alaev.coursework.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalTime;

@Table(name = "trainingwork")
@Entity
@Data
public class TrainingWork {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "train_id", nullable = false)
    private Training train;

    @ManyToOne(optional = false)
    @JoinColumn(name = "name", nullable = false)
    private Workout name;

    @Column(name = "repet", nullable = false)
    private Integer repet;

    @Column(name = "time_work", nullable = false)
    private LocalTime timeWork;

    @Column(name = "time_rest", nullable = false)
    private LocalTime timeRest;
}