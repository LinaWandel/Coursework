package dev.alaev.coursework.entity;

import lombok.Data;

import javax.persistence.*;

@Table(name = "client", indexes = {
        @Index(name = "client_tel_key", columnList = "tel", unique = true),
        @Index(name = "client_passport_key", columnList = "passport", unique = true)
})
@Entity
@Data
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "fio", nullable = false, length = 90)
    private String fio;

    @Column(name = "gender", nullable = false, length = 1)
    private Character gender;

    @Column(name = "height")
    private Integer height;

    @Column(name = "weight")
    private Integer weight;

    @Column(name = "param", length = 10)
    private String param;

    @Column(name = "fat")
    private Integer fat;

    @Column(name = "muscles")
    private Integer muscles;

    @Column(name = "water")
    private Integer water;

    @Column(name = "tel", nullable = false)
    private Integer tel;

    @Column(name = "passport", nullable = false)
    private Integer passport;
}