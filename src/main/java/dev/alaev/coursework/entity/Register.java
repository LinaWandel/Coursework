package dev.alaev.coursework.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Table(name = "register")
@Entity
public class Register {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "date", nullable = false)
    private LocalDate date;

    @Column(name = "\"time\"", nullable = false)
    private LocalTime time;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_client", nullable = false)
    private Client client;

    @ManyToOne(optional = false)
    @JoinColumn(name = "fio_coach", nullable = false)
    private Coach coach;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_training", nullable = false)
    private Training training;

    @Column(name = "cost", nullable = false)
    private Integer cost;

    @Column(name = "pay_status", nullable = false, length = 20)
    private String payStatus;
}