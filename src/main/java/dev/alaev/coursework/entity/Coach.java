package dev.alaev.coursework.entity;

import lombok.Data;

import javax.persistence.*;

@Table(name = "coach", indexes = {
        @Index(name = "coach_passport_key", columnList = "passport", unique = true),
        @Index(name = "coach_tel_key", columnList = "tel", unique = true)
})
@Entity
@Data
public class Coach {
    @Id
    @Column(name = "fio", nullable = false, length = 90)
    private String fio;

    @Column(name = "gender", nullable = false, length = 1)
    private Character gender;

    @Column(name = "exp")
    private Integer exp;

    @Column(name = "education", length = 100)
    private String education;

    @Column(name = "achieve", length = 100)
    private String achieve;

    @Column(name = "rating", nullable = false)
    private Integer rating;

    @Column(name = "tel", nullable = false)
    private Integer tel;

    @Column(name = "salary", nullable = false)
    private Integer salary;

    @Column(name = "passport", nullable = false)
    private Integer passport;

    @Column(name = "adress", nullable = false, length = 50)
    private String adress;
}