package dev.alaev.coursework.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalTime;

@Table(name = "training")
@Entity
@Data
public class Training {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "type", nullable = false, length = 15)
    private String type;

    @Column(name = "\"time\"", nullable = false)
    private LocalTime time;

    @Column(name = "burn_kkal")
    private Integer burnKkal;

    @Column(name = "cost", nullable = false)
    private Integer cost;

    @Column(name = "recomend_gender", length = 1)
    private Character recomendGender;

    @Column(name = "level", length = 15)
    private String level;
}